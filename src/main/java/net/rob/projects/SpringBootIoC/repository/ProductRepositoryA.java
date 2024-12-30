package net.rob.projects.SpringBootIoC.repository;

public class ProductRepositoryA implements IProductRepository {

  public ProductRepositoryA() {
    System.out.println("ProductRepositoryA: constructor");
  }

  @Override
  public void save(String name) {
    System.out.println("== SAVE " + this.getClass().getSimpleName() + " ==");
    System.out.println("Producto guardado exitosamente: " + name);
  }

  @Override
  public void delete(String name) {
    System.out.println("== REMOVE " + this.getClass().getSimpleName() + " ==");
    System.out.println("Producto eliminado exitosamente: " + name);
  }
}
