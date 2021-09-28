package com.cos.newsbatchcarw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.cos.newsbatchcarw.domain.NewsRepository;

import lombok.RequiredArgsConstructor;

@EnableScheduling
@SpringBootApplication
public class NewsbatchcarwApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(NewsbatchcarwApplication.class, args);
	}

}
