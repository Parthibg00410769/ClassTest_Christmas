package com.example.productservice;

@FeignClient(name = "confirm", url = "http://localhost:8081")
public interface productClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody GetProductById getProductById);

}
