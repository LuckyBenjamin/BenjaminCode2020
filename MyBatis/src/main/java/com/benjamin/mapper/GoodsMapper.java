package com.benjamin.mapper;

import com.benjamin.bean.Goods;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GoodsMapper extends Mapper<Goods> {

    List<Goods> getInfo(Goods goods);
}