package ru.spring.javaconfig;

public class AMDCPU  implements CPU {
    @Override
    public String getVendor() {
        return "AMDCPU";
    }
}
