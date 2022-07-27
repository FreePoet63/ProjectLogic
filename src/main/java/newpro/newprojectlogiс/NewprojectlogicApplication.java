package newpro.newprojectlogiс;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
		scanBasePackages = {"newpro.newprojectlogiс.*",
				            "newpro.newprojectlogictest.*"}
)
public class NewprojectlogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewprojectlogicApplication.class, args);
	}

}
