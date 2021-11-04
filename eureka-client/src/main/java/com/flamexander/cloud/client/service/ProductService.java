package com.flamexander.cloud.client.service;

import com.flamexander.cloud.client.entites.Category;
import com.flamexander.cloud.client.entites.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return new ArrayList<Product>() {
            {
                add(new Product(1L, new Category(), "1","test", "t", "tttt", 20));
            }
        };
    }
}
