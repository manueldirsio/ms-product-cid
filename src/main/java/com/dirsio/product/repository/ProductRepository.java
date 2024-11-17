package com.dirsio.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dirsio.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
