package com.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seckill.pojo.SeckillOrder;
import com.seckill.pojo.User;

public interface ISeckillOrderService extends IService<SeckillOrder> {


    Long getResult(User user, Long goodsId);
}
