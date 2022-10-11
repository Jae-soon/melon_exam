package com.ll.exam.melon_exam.product.repository;

import com.ll.exam.melon_exam.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}