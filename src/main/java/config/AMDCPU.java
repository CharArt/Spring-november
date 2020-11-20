package config;

import org.springframework.stereotype.Component;

@Component
public class AMDCPU  implements CPU {
    @Override
    public String getVendor() {
        return "AMDCPU";
    }
}
