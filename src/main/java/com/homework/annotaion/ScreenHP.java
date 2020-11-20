package com.homework.annotaion;

import org.springframework.stereotype.Component;

@Component
public class ScreenHP implements Screen {
    @Override
    public String getVendor() { return "Screen HP";}
}