package config;

import org.springframework.stereotype.Component;

@Component
public class KingstomMemory implements Memory {
    @Override
    public String getVendor() {
        return "Kingston";
    }
}
