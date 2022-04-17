package ru.sergeysemenov.soap_test.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sergeysemenov.soap_test.entetis.ProductEntity;
import ru.sergeysemenov.soap_test.repositories.ProductRepository;
import ru.sergeysemenov.soap_test.soap.product.Product;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public static final Function<ProductEntity, Product> functionEntityToSoap = productEntity -> {
        Product product = new Product();
        product.setId(product.getId());
        product.setTitle(productEntity.getTitle());
        product.setPrice(productEntity.getPrice());
        product.setCategory(product.getCategory());
        return product;
    };

    public Product findById(Long id){
       return productRepository.findById(id).map(functionEntityToSoap).get();
    }



}
