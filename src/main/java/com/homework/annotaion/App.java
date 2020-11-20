package com.homework.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Computer computer = ctx.getBean(Computer.class);
        System.out.println("CPU: " + computer.getCpu().getVendor());
        System.out.println("Memory: " + computer.getMemoryList().stream().map(Device::getVendor).collect(Collectors.joining(", ")));
        System.out.println("Screen" + computer.getScreen().getVendor());
        System.out.println("Storage" + computer.getStorageList().stream().map(Device::getVendor).collect(Collectors.joining(",")));

    }
}
