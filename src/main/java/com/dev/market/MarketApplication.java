package com.dev.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketApplication {
	public static void main(String[] args) {

		SpringApplication.run(MarketApplication.class, args);
		System.out.println("market server start");
	}

}
