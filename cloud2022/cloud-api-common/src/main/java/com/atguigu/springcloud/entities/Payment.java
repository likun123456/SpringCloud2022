package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2022
 * @description: 支付实体类
 * @author: likun
 * @create: 2022-03-08 20: 50
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;
}
