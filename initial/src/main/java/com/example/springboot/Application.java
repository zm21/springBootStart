package com.example.springboot;

import java.util.Arrays;

import com.example.springboot.storage.StorageProperties;
import com.example.springboot.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Application {

	public static void main(String[] args) {
		/*ApplicationContext ctx =*/ SpringApplication.run(Application.class, args);

		/*System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}*/
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return(args) -> {
			try {
				storageService.deleteAll();
				storageService.init();
			}
			catch(Exception ex) {
				System.out.println("-----Problem---");
			}
		};
	}
}
