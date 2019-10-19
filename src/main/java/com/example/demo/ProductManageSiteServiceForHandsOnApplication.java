package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mybatis")
public class ProductManageSiteServiceForHandsOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManageSiteServiceForHandsOnApplication.class, args);
	}

}
