package com.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerExampleApplication.class, args);
		System.out.println("Kafka producer example");
	}

}
