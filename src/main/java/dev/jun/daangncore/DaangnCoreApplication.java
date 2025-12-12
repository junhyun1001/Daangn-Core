package dev.jun.daangncore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DaangnCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaangnCoreApplication.class, args);
    }

}
