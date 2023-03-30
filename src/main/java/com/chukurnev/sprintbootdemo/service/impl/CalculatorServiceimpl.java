package com.chukurnev.sprintbootdemo.service.impl;

import com.chukurnev.sprintbootdemo.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceimpl implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
