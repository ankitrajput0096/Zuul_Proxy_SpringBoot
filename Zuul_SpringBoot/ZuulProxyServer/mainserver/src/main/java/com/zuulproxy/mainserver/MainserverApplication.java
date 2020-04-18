package com.zuulproxy.mainserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy    // Using this annotation, we enable zuul proxy dependency.
@SpringBootApplication
public class MainserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainserverApplication.class, args);
	}

}
