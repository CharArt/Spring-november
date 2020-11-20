package com.homework.annotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class Config {

    @Bean("MemoryOfList")
    public List<Memory> memoryOfList(){
        return List.of(new KingstonMemory(),new SonyMemory());
    }
    @Bean("StorageOfList")
    public List<Storage> storageOfList () {
        return List.of(new FlashUSBKingston(), new HardDriveToshiba());
    }
}
