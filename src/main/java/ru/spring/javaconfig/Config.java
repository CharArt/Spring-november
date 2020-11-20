package ru.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {
    @Bean("mycomp")
    public Computer computer(){
        Computer c = new Computer();
        c.setCpu(amdCPU());
        c.setMemoryList(List.of(sonyMemory()));
        return c;
    }
    @Bean
    public CPU intelCPU (){
        return new intelCPU();
    }
    @Bean
    public  CPU amdCPU () {
        return new AMDCPU();
    }
    @Bean
    public Memory sonyMemory(){
        return new SonyMemory();
    }
    @Bean
    public List<Memory> memoryList(){
        return List.of(new SonyMemory(), new KingstomMemory());
    }
}
