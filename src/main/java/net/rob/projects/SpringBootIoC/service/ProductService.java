package net.rob.projects.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import net.rob.projects.SpringBootIoC.repository.IProductRepository;

public class ProductService {

  @Autowired
  @Qualifier("productRepositoryA") // Se inyecta el bean con el nombre especificado
  // Esto es solo posible si es las clases tienen implementado la interfaz IProductRepository o una abstracción
  // No es posible con clases normales
  private IProductRepository productRepository;
  
  public ProductService() {
    System.out.println("ProductService: constructor");
  }

  public void save(String name) {
    productRepository.save(name);
  }

  public void remove(String name) {
    productRepository.delete(name);
  }
}
