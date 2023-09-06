package dev.ecomm.product.dtos;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
