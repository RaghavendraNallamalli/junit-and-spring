package springrestassignments.springrest7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = OrderRepository.class)

public class Springrest7Application {

	public static void main(String[] args) {
		SpringApplication.run(Springrest7Application.class, args);
	}

}
