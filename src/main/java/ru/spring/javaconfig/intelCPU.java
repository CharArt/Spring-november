package ru.spring.javaconfig;

public class intelCPU implements CPU {
    @Override
    public String getVendor() {
        return "IntelCPU";
    }
}
