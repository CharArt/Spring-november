package com.java.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Collectors;

public class Application {
    public static void main (String [] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Computer computer = (Computer) ctx.getBean(Computer.class);
        System.out.println("CPU" + computer.getCpu().getVendor());
//        System.out.println("CPU" + computer.getMemoryList().get(0).getVendor());
//        System.out.println("CPU" + computer.getMemoryList().stream().map(m->m.getVendor()));
        System.out.println("CPU" + computer.getMemoryList().stream().map(Memory::getVendor).collect(Collectors.joining(",")));
        CPU cpu = (CPU) ctx.getBean("intelCPU");
        System.out.println(cpu.getVendor());
    }
}
