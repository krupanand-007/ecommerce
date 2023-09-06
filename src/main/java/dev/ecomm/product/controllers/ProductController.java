package dev.ecomm.product.controllers;

import dev.ecomm.product.dtos.ProductDto;
import dev.ecomm.product.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping(value="/{id}")
    public ProductDto getProduct(@PathVariable("id") Long productId){
        return productService.getProduct(productId);
    }
    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productService.createProduct(productDto);
    }

}
