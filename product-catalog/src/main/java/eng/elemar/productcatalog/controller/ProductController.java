package eng.elemar.productcatalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eng.elemar.productcatalog.model.Product;
import eng.elemar.productcatalog.repository.ProductRepository;

@RestController
@RequestMapping(value = "product")
public class ProductController {

    private ProductRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Product> findAll(){
        return (List<Product>) repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return repository.findById(id);
    }
}
