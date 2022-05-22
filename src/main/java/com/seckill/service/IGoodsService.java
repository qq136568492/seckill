package com.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seckill.pojo.Goods;
import com.seckill.vo.GoodsVo;

import java.util.List;

public interface IGoodsService extends IService<Goods> {

    /**
     * @description 获取产品列表
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * @description 获取商品详情
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
