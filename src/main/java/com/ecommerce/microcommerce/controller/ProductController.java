package com.ecommerce.microcommerce.controller;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    //Produits/{id} c'est l'uri de la methode findById
    @GetMapping(value = "Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product = new Product(id,"Aspirateur", 250);
        return product;
    }
}
