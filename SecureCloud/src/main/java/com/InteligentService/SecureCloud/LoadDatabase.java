package com.InteligentService.SecureCloud;



import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@Slf4j
public class LoadDatabase {


    @Bean
    CommandLineRunner initDatabase(UserRepository repository){
        return args -> {
            System.out.println("Preloading "+repository.save(new User("Lena")));
            System.out.println("Preloading "+repository.save(new User("Sergej")));

        };


    }
}
