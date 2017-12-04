package mx.com.dxesoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPaginationApplication.class, args);
	}


}
