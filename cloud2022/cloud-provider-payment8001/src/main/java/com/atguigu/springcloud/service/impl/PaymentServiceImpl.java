package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @description:
 * @author: likun
 * @create: 2022-03-08 21: 07
 **/
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
