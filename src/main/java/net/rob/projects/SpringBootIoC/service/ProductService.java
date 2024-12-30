package net.rob.projects.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.rob.projects.SpringBootIoC.repository.IProductRepository;

@Service
public class ProductService {
  private IProductRepository productRepository;

  public ProductService(@Qualifier("productRepositoryA") IProductRepository productRepository) {
    this.productRepository = productRepository;
    System.out.println("ProductService: constructor");
  }

  public void save(String name) {
    productRepository.save(name);
  }

  public void remove(String name) {
    productRepository.delete(name);
  }
}
