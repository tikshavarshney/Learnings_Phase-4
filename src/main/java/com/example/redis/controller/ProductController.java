package com.example.redis.controller;

import com.example.redis.entity.Product;
import com.example.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("create")
    public String save(@RequestBody Product product) {
        return productDao.save(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return productDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
        return productDao.deleteProduct(id);
    }
}
