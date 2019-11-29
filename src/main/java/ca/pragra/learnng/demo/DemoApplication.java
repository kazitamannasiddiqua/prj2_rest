package ca.pragra.learnng.demo;

import ca.pragra.learnng.demo.domain.UserDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
    private RestTemplate restTemplate;

    public DemoApplication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Trigggering Build");
    }
//
//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            UserDetails userDetails = restTemplate.getForObject("https://api.github.com/users/{username}", UserDetails.class,"arjunsharman06");
//            System.out.println(userDetails);
//        };
//    }

}
