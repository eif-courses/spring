package com.example;

import com.example.realizacija.Course;
import com.example.realizacija.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaskaitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaskaitosApplication.class, args);
	}
	@Bean
	CommandLineRunner loadData(CourseRepository courseRepository){
		return args -> {
			String courses[] = {"Programavimas kalba Java", "Operacinės sistemos", "Struktūrinio programvimo praktika",
					"Web saugumas","Programavimas išmaniesiems įrenginiams I"};

			for (String item: courses) {
				courseRepository.save(new Course(""+item))	;
			}

		};
	}
}
