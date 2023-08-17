package nl.georg.jsfspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "nl.georg.jsfspringboot")
public class JsfSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsfSpringBootApplication.class, args);
    }
}
