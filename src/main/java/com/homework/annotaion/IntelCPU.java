package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class IntelCPU implements CPU {
    @Override
    public String getVendor() {
        return "Intel";
    }
}
