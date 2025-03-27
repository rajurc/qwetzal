package com.api.trackingnumgenerator;

import com.api.trackingnumgenerator.repository.ParcelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = ParcelRepository.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TrackingNumGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackingNumGeneratorApplication.class, args);
	}

}
