package com.idat.kevinramirez.Reserva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EfKevinramirezReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKevinramirezReservaApplication.class, args);
	}

}
