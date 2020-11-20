package ru.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.javaconfig.Computer;
import java.util.stream.Collectors;

public class Application {
    public static void main (String [] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Computer mycomp = (Computer) ctx.getBean("mycomp");
        System.out.println("CPU" + mycomp.getCpu().getVendor());
//        System.out.println("CPU" + mycomp.getMemoryList().get(0).getVendor());
//        System.out.println("CPU" + mycomp.getMemoryList().stream().map(m->m.getVendor()));
        System.out.println("CPU" + mycomp.getMemoryList().stream().map(Memory::getVendor).collect(Collectors.joining(",")));
        CPU cpu = (CPU) ctx.getBean("intelCPU");
        System.out.println(cpu.getVendor());


    }
}
