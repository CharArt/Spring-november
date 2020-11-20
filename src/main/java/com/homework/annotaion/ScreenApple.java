package com.homework.annotaion;

import org.springframework.stereotype.Component;


public class ScreenApple implements Screen {
    @Override
    public String getVendor() {return "Screen Apple";}
}