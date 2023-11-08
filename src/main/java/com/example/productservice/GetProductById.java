package com.example.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProductById {
    private int productId;
    private String name;
    private int quantity;
    private int warehouseId;

}
