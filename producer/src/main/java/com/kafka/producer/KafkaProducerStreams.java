package com.kafka.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
            return () -> {
                RiderLocation location = new RiderLocation("Rider1", 23.67, 28.93);
                System.out.println("Sending rider location: " + location.getRiderId());
                return location;
            };
    }
}
