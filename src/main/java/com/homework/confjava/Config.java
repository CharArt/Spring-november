package com.homework.confjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public Computer computer(){
        Computer computer = new Computer();
        computer.setCpu(amdCPU());
        computer.setMemoryList(memoryList());
        computer.setScreen(screenApple());
        computer.setStorageList(storageList());
        return computer;
    }

    @Bean public CPU intelCPU() {
        return new IntelCPU();
    }
    @Bean public CPU amdCPU(){
        return new AmdCpu();
    }
    @Bean public Memory sonyMemory(){ return new SonyMemory(); }
    @Bean public Memory kingstonMemory(){ return new KingstonMemory(); }
    @Bean public Screen screenHP() { return new ScreenHP();}
    @Bean public Screen screenApple() { return new ScreenApple();}
    @Bean public Storage flashUSBKingston() { return new FlashUSBKingston(); }
    @Bean public Storage hardDriverToshiba() { return  new HardDriveToshiba();}

    @Bean
    public List<Memory> memoryList(){
        return List.of(new KingstonMemory(), new SonyMemory(), new KingstonMemory());
    }

    @Bean
    public List<Storage> storageList(){
        return  List.of(flashUSBKingston(),hardDriverToshiba());
    }
}
