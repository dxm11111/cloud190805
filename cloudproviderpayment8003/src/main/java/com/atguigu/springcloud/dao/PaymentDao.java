package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao
{
    //创建一条记录
    public void create(Payment payment);
    //读取一条记录
    public Payment getPaymentById(Long id);
}
