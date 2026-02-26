package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine dieselEngine() {
        return new DieselEngine();
    }

    @Bean
    public Engine petrolEngine() {
        return new PetrolEngine();
    }

    // Choose which Engine to inject here
    @Bean
    public Car car(Engine dieselEngine) {
        return new Car(dieselEngine);
    }
}
