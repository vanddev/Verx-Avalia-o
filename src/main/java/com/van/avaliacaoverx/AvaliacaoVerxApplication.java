package com.van.avaliacaoverx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AvaliacaoVerxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoVerxApplication.class, args);
	}

}
