package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class HardDriveToshiba implements Storage {
    @Override
    public String getVendor() {return "Hard Drive Toshiba";}
}