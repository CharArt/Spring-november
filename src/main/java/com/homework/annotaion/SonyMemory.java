package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class SonyMemory implements Memory {
    @Override
    public String getVendor() {
        return "Sony";
    }
}
