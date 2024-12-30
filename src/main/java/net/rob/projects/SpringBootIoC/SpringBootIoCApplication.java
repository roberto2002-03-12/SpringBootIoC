package net.rob.projects.SpringBootIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.rob.projects.SpringBootIoC.service.ProductService;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner {

	// Evitas crear instancia con al momento de crear la clase
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot");
	}

	// Ejecuta y guarda esta clase o metodo al ejecutar el proyecto
	@Bean
	public CommandLineRunner comandoGenerico() {
		return args -> {
			System.out.println("== productRepositoryA == ");
			productService.save("Control remoto");
			productService.remove("Laptop");
		};
	}

}
