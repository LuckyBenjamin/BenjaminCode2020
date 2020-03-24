package com.benjamin.controller;

import com.benjamin.bean.Goods;
import com.benjamin.event.OrderEvent;
import com.benjamin.mapper.GoodsMapper;
import org.apache.catalina.core.ApplicationContext;
import org.apache.tomcat.util.threads.ScheduledThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.AppletContext;
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
public class GoodsController {
    @Autowired
    private GoodsMapper goodsMapper;

    /*@Autowired
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;*/


    @GetMapping("getGoodsInfo")
    public Map getGoodsInfo(Goods goods) {
        HashMap<String, Object> map = new HashMap<>();
        List<Goods> goods2 = goodsMapper.getInfo(goods);
        map.put("data",goods2);
        return map;
    }

    @RequestMapping("kk")
    public void test(Goods goods,Integer integer){
        /*scheduledThreadPoolExecutor.execute(() -> {
            System.out.println("fffffffffffffffffffffffffffff");
        });*/

    }
}
