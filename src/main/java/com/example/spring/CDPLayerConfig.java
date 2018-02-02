package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPLayerConfig {
    @Bean
    public CompactDisc getBlankDisc() {
        return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Bearleeees");
    }
}
