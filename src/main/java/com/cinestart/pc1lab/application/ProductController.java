package com.cinestart.pc1lab.application;

import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<PagedResponseDto<ProductDto>> getAllProducts(
            @PageableDefault(page = 0, size = 10) Pageable pageable) {

        Page<ProductDto> productsPage = productService.getAllProducts(pageable);

        // Crea la respuesta final usando tu DTO de paginación
        PagedResponseDto<ProductDto> responseDto = new PagedResponseDto<>(productsPage);

        return ResponseEntity.ok(responseDto);
    }
}
