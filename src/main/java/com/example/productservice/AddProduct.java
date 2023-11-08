package com.example.productservice;

import lombok.Data;

import java.util.ArrayList;

@Data
@Service
public class AddProduct {
    private List<productClient> Product1 = new ArrayList<>();
    public void AddProduct(productClient Product) {
        Product1.add(Product);
    }
    public String ackMsg(GetProductById getProduct){
        String message = "Thank you! Product has been added. Product Name: " + getProduct.getName() + "with id: " + getProduct.getProductId();
    }

}
