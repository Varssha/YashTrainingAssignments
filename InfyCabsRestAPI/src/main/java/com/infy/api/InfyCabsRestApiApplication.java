package com.infy.api;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class InfyCabsRestApiApplication implements CommandLineRunner{

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(InfyCabsRestApiApplication.class, args);
	}

	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
