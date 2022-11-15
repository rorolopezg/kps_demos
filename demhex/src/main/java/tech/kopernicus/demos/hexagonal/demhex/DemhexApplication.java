package tech.kopernicus.demos.hexagonal.demhex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemhexApplication implements CommandLineRunner {
	@Value("{}")
	public static void main(String[] args) {
		SpringApplication.run(DemhexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
