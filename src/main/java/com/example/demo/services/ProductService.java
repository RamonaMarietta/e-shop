package com.example.demo.services;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.ProductEntity;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductEntity addProductEntity(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> findAllProductEntity() {
        return productRepository.findAll();
    }

    public ProductEntity findProductEntityById(Long id) {
        return productRepository.findProductEntityById(id).orElseThrow(() -> new ProductNotFoundException("User by id " + id + "was not found "));
    }

    public ProductEntity updateProductEntity(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public void deleteProductEntity(Long id) {
        productRepository.deleteById(id);
        //productRepository.deleteProductEntityById(id);
    }

    public List<ProductEntity> getByCategoryId(Long categorid) {
        var result = productRepository.findProductEntityByCategoryId(categorid);
        return result;
    }
}
