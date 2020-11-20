package config;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Computer {
    private CPU cpu;

    private List<Memory> memoryList;

    public Computer() {}

    public CPU getCpu() { return cpu; }
    public void setCpu(CPU cpu) { this.cpu = cpu; }

    public List<Memory> getMemoryList() {
        return memoryList;
    }

    public void setMemoryList(List<Memory> memoryList) {
        this.memoryList = memoryList;
    }
}
