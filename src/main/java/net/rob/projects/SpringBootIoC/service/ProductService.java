package net.rob.projects.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.rob.projects.SpringBootIoC.repository.IProductRepository;

// usar como @Service
@Component // Tratar como bean generico
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
