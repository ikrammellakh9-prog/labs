package com.example.demo.config;

import com.example.demo.api.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig extends ResourceConfig {
    public MyConfig() {
        register(CompteRestJaxRSAPI.class);
    }
}
