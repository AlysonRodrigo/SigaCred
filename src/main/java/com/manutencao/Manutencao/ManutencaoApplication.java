package com.manutencao.Manutencao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@SpringBootApplication
public class ManutencaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManutencaoApplication.class, args);
	}

}
