package id.mareno.belajarspringdasar.service;

import id.mareno.belajarspringdasar.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
@Component
public class ProductService {

    @Getter
    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
