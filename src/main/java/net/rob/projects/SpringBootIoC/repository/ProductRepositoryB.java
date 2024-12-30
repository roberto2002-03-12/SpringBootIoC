package net.rob.projects.SpringBootIoC.repository;

import org.springframework.stereotype.Repository;

@Repository("productRepositoryB")
public class ProductRepositoryB implements IProductRepository {
  public ProductRepositoryB() {
    System.out.println("ProductRepositoryB: constructor");
  }

  @Override
  public void save(String name) {
    System.out.println("== SAVE " + this.getClass().getSimpleName() + " ==");
    System.out.println("ProductRepositoryB: save " + name);
  }

  @Override
  public void delete(String name) {
    System.out.println("== REMOVE " + this.getClass().getSimpleName() + " ==");
    System.out.println("ProductRepositoryB: delete " + name);
  }
}
