package config;

import org.springframework.stereotype.Component;

@Component
public class intelCPU implements CPU {
    @Override
    public String getVendor() {
        return "IntelCPU";
    }
}
