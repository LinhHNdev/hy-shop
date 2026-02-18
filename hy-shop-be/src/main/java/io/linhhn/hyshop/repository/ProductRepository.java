package io.linhhn.hyshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.linhhn.hyshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
