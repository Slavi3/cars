package com.telerikacademy.cars.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelsConfiguration {
    @Bean
    public Class<Car> provideCarClass() {
        return Car.class;
    }
}
