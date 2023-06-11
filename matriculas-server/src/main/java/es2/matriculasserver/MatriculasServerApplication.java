package es2.matriculasserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class MatriculasServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatriculasServerApplication.class, args);
	}

}
