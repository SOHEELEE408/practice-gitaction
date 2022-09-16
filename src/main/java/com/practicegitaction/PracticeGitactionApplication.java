package com.practicegitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PracticeGitactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeGitactionApplication.class, args);
    }

}
