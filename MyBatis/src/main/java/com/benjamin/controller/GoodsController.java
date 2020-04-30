package com.benjamin.controller;

import com.benjamin.bean.Goods;
import com.benjamin.event.OrderEvent;
import com.benjamin.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.apache.tomcat.util.threads.ScheduledThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.AppletContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GoodsController
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/3/12
 **/
@RestController
@Slf4j
public class GoodsController {
    @Autowired
    private GoodsMapper goodsMapper;

    @PostMapping("getGoodsInfo")
    public Map getGoodsInfo(Goods goods,String a) {
        log.info("Goods {},     a{}",goods,a);
        a = "1";
        HashMap<String, Object> map = new HashMap<>();
        List<Long> list;
        if ("2".equals(a)) {
            goods.setMerchantId(88888);
            List<Goods> goods2 = goodsMapper.getInfo(goods);
            list = new ArrayList<>();
            goods2.forEach(x -> list.add(x.getId().longValue()));
        } else {
            goods.setMerchantId(80);
            List<Goods> goods2 = goodsMapper.getInfo(goods);
            list = new ArrayList<>();
            goods2.forEach(x -> list.add(x.getId().longValue()));
        }
        map.put("data",list);
        return map;
    }

    @PostMapping("getGoodsInfo2")
    public Map getGoodsInfo2(Goods goods,@RequestHeader(value = "aaa" ,required = true) Integer aaa) {
        System.out.println("---------------------------"+aaa+"----------------------------------------");
        goods.setMerchantId(80);
        HashMap<String, Object> map = new HashMap<>();
        Example example = new Example(Goods.class);
        example.createCriteria()
                .andEqualTo("merchantId",goods.getMerchantId())
                .andEqualTo("valid",Boolean.TRUE);
        List<Goods> goods2 = goodsMapper.selectByExample(example);
        map.put("data",goods2);
        return map;
    }

}
