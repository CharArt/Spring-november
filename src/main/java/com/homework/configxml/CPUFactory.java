package com.homework.configxml;

public class CPUFactory {

    public CPU createCPU(String name){
        if ("intel".equalsIgnoreCase(name))
            return new IntelCPU();
        else if ("amd".equalsIgnoreCase(name))
            return new AmdCpu();
        return () -> "Default";
    }

}
