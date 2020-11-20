package com.homework.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Computer {

    private CPU cpu;
    private List<Memory> memoryList;
    private Screen screen;
    private List<Storage> storageList;

    public Computer() {}

    public Computer(CPU cpu) {
        this.cpu = cpu;
    }
    @Autowired
    public Computer(CPU cpu,
                    @Qualifier("MemoryOfList") List<Memory> memoryList,
                    Screen screen,
                    @Qualifier("StorageOfList") List<Storage> storageList) {
        this.cpu = cpu;
        this.memoryList = memoryList;
        this.screen = screen;
        this.storageList = storageList;
    }

    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public List<Memory> getMemoryList() {
        return memoryList;
    }
    public void setMemoryList(List<Memory> memoryList) {
        this.memoryList = memoryList;
    }

    public Screen getScreen() {return screen;}
    public void setScreen(Screen screen) {this.screen = screen;}

    public List<Storage> getStorageList() {return storageList;}
    public void setStorageList(List<Storage> storageList) {this.storageList = storageList;}
}
