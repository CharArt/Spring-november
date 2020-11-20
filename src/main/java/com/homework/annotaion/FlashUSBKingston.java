package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class FlashUSBKingston implements Storage {
    @Override
    public String getVendor() {return "Flash USB Kingston";}
}