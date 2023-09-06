package dev.ecomm.product.services;

import dev.ecomm.product.dtos.ProductDto;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    ProductDto getProduct(Long productId);
}
