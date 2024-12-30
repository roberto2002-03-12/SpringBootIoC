package net.rob.projects.SpringBootIoC.repository;

public interface IProductRepository {
  void save(String name);
  void delete(String name);
}
