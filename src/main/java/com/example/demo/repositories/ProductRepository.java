package com.example.demo.repositories;

import com.example.demo.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    Optional<ProductEntity> findProductEntityById(Long id);

    void deleteProductEntityById(Long id);

    List<ProductEntity> findProductEntityByCategoryId(Long id);
}
