package com.example.productservice;

import org.springframework.beans.factory.annotation.Autowired;

@RestController

public class ProductController {
    private final GetProductById getProductById;
    private final AddProduct addProduct;

    @Autowired
    public void ProductController(GetProductById getProductById, AddProduct addProduct){
        this.getProductById = getProductById;
        this.addProduct = addProduct;
    }
    @PostMapping("/confirm-product-register")
    public String confirmProductRegister(@RequestBody GetProductById getProductById){
        String confirm = productClient.someDetails(getProductById);
        String response = confirm + " " + addProduct(getProductById);
        return response;
    }
}
