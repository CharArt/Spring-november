package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class KingstonMemory implements Memory {
    @Override
    public String getVendor() {
        return "Kingston";
    }

}
