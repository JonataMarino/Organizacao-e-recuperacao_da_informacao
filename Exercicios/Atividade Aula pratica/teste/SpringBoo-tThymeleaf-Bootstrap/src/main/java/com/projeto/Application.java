package com.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {
    // Inicializa a Aplicação
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
