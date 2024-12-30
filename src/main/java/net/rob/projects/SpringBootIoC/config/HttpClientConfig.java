package net.rob.projects.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import net.rob.projects.SpringBootIoC.repository.IProductRepository;

@Configuration
public class HttpClientConfig {
  @Bean
  RestTemplate restTemplate(IProductRepository productRepository) {
    productRepository.save("Doc. ejemplo");
    return new RestTemplate();
  }
}
