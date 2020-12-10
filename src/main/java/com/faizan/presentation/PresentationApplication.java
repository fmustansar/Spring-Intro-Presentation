package com.faizan.presentation;

import com.faizan.presentation.dependencyinjection.mobilephone.MobilePhone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PresentationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PresentationApplication.class, args);
		MobilePhone handy = context.getBean(MobilePhone.class);;
		handy.start();
	}

}
