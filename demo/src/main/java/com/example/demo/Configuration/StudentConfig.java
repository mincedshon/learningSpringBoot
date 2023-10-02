package com.example.demo.Configuration;

import com.example.demo.Model.Music;
import com.example.demo.Repository.MusicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(MusicRepository repository) {
        return args -> {
            Music test = new Music(
                    "6 pak abs",
                    "mike chang"
            );

            Music test2 = new Music(
                    "dangerously",
                    "charlie puth"
            );

            repository.saveAll(
                    List.of(test, test2)
            );
        };
    }
}
