package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @description:
 * @author: likun
 * @create: 2022-03-08 21: 04
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private IPaymentService iPaymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = iPaymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        }
        return new CommonResult(500, "插入失败", null);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = iPaymentService.getPaymentById(id);
        if (payment == null) {
            return new CommonResult(500, "查询失败", null);
        }
        return new CommonResult(200, "查询成功", payment);
    }
}
