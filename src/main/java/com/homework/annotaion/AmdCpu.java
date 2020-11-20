package com.homework.annotaion;

import org.springframework.stereotype.Component;

public class AmdCpu implements CPU {

    @Override
    public String getVendor() {
        return "AMD";
    }
}