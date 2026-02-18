package io.linhhn.hyshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.linhhn.hyshop.dto.ProductRequestDTO;
import io.linhhn.hyshop.entity.Product;
import io.linhhn.hyshop.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product = productRepository.save(product);
        return product;
    }
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
