package dev.ecomm.product.services.Impl;

import dev.ecomm.product.dtos.ProductDto;
import dev.ecomm.product.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class FakeStoreProductService implements ProductService {
    private final RestTemplateBuilder restTemplateBuilder;
    private String createProductRequestUrl = "https://fakestoreapi.com/products";
    private String getProductRequestUrl = "https://fakestoreapi.com/products/{id}";

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ProductDto productDto1 = restTemplate.postForObject(createProductRequestUrl, productDto, ProductDto.class);
        return productDto1;
    }

    @Override
    public ProductDto getProduct(Long productId) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductDto> responseEntity = restTemplate.getForEntity(getProductRequestUrl, ProductDto.class, productId);
        return responseEntity.getBody();

    }
}
