package net.rob.projects.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import net.rob.projects.SpringBootIoC.repository.IProductRepository;

@Service
public class ProductService {
  private IProductRepository productRepository;

  public ProductService(@Qualifier("productRepositoryA") IProductRepository productRepository) {
    this.productRepository = productRepository;
    System.out.println("ProductService: constructor");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("ProductService: postConstruct");
  }

  @PreDestroy // al momento de cerrar la aplicacion se ejecuta este metodo
  public void preDestroy() {
    System.out.println("ProductService: preDestroy");
  }

  public void save(String name) {
    productRepository.save(name);
  }

  public void remove(String name) {
    productRepository.delete(name);
  }
}
