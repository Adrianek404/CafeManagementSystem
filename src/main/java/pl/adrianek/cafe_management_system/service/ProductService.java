package pl.adrianek.cafe_management_system.service;

import org.springframework.http.ResponseEntity;
import pl.adrianek.cafe_management_system.wrapper.ProductWrapper;

import java.util.List;
import java.util.Map;

public interface ProductService {
    ResponseEntity<String> addNewProduct(Map<String, String> requestMap);

    ResponseEntity<List<ProductWrapper>> getAllProduct();

    ResponseEntity<String> updateProduct(Map<String, String> requestMap);

}
