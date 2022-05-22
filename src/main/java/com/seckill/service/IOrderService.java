package com.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seckill.pojo.Order;
import com.seckill.pojo.User;
import com.seckill.vo.GoodsVo;
import com.seckill.vo.OrderDetailVo;
import org.springframework.stereotype.Repository;

public interface IOrderService extends IService<Order> {

    /**
     * @description 秒杀
     * @param user
     * @param goods
     * @return
     */
    Order seckill(User user, GoodsVo goods);

    /**
     * @description 订单详情
     * @param orderId
     * @return
     */
    OrderDetailVo detail(Long orderId);

    String createPath(User user, Long goodsId);

    boolean checkPath(User user, Long goodsId,String path);

    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
