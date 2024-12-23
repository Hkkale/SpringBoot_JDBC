package com.hiten.springboot_jdbc;

import com.hiten.springboot_jdbc.model.Alien;
import com.hiten.springboot_jdbc.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext factory = SpringApplication.run(SpringbootJdbcApplication.class, args);

		Alien a1 = factory.getBean(Alien.class);

		a1.setAge(10);
		a1.setDomain("Java Devloper");
		a1.setName("Hiten");
		a1.setExp(3);

		AlienRepo repo =factory.getBean(AlienRepo.class);
		repo.save(a1);
		System.out.println(repo.findAll());


	}

}
