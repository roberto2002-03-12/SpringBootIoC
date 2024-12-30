package net.rob.projects.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Profile;
// import org.springframework.context.annotation.Primary;

import net.rob.projects.SpringBootIoC.repository.ProductRepositoryA;
import net.rob.projects.SpringBootIoC.repository.ProductRepositoryB;
import net.rob.projects.SpringBootIoC.service.ProductService;

@Configuration
public class BeansInjector {

  // @Profile("prod") ejecutar bean solo en prod
  @Bean("productRepositoryA")
  // @Primary // en caso no se especifique que bean inyectar en el servicio que hace referencia indirecta o directa, se inyectará este
  ProductRepositoryA createProductRepository() {
    return new ProductRepositoryA();
  }

  // @Profile("dev") ejecutar bean solo en dev
  @Bean("productRepositoryB")
  ProductRepositoryB createProductRepositoryB() {
    return new ProductRepositoryB();
  }

  @Bean
  ProductService createProductService() {
    return new ProductService();
  }
}
