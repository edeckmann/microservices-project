package eng.elemar.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import eng.elemar.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
