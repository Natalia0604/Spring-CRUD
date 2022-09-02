package com.example.itdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//要運用@ComponentScan把所有相關的package都加在括號內，
//還有@EntityScan，把所有相關的package都加在括號內，
//目的是讓系統去檢查各個package的檔案。

@SpringBootApplication
@ComponentScan({"com.example.itdemo","com.example.model","com.example.controller","com.example.service","com.example.repository"})
@EntityScan({"com.example.itdemo","com.example.model","com.example.controller","com.example.service","com.example.repository"})
public class ItDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItDemoApplication.class, args);
	}

}
