package in.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

    public String name="Sachin Tendulkar";
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
