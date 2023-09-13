package com.example.demo.controllers;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.ProductEntity;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductEntity>> getAllProductEntity() {
        List<ProductEntity> productEntities = productService.findAllProductEntity();
        return new ResponseEntity<>(productEntities, HttpStatus.OK);
    }
    //todo regarde si cést la bon solution
    @GetMapping("/find/{id}")
    public ResponseEntity<ProductEntity> getProductEntityById(@PathVariable("id") Long id) {

        try {
            ProductEntity productEntities = productService.findProductEntityById(id);
            return new ResponseEntity<>(productEntities, HttpStatus.OK);
        } catch (ProductNotFoundException exception) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ProductEntity> addProductEntity(@RequestBody ProductEntity productEntity) {
        ProductEntity newProductEntity = productService.addProductEntity(productEntity);
        return new ResponseEntity<>(newProductEntity, HttpStatus.CREATED);
    }
    //todo return 404 when entity not found
    @PutMapping("/update")
    public ResponseEntity<ProductEntity> updateProductEntity(@RequestBody ProductEntity productEntity) {
        ProductEntity updateProductEntity = productService.updateProductEntity(productEntity);
        return new ResponseEntity<>(updateProductEntity, HttpStatus.OK);
    }

    //todo return 404 when entity not found
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProductEntity(@PathVariable("id") Long id) {
        productService.deleteProductEntity(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findbycategory/{categorid}")
    public ResponseEntity<List<ProductEntity>> findByCategoryId(Long categorid){
        return new ResponseEntity<>(productService.getByCategoryId(categorid), HttpStatus.OK);
    }


}
