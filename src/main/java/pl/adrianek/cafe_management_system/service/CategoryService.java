package pl.adrianek.cafe_management_system.service;

import org.springframework.http.ResponseEntity;
import pl.adrianek.cafe_management_system.POJO.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    ResponseEntity<String> addNewCategory(Map<String, String> requestMap);

    ResponseEntity<List<Category>> getAllCategory(String filterValue);

    ResponseEntity<String> updateCategory(Map<String, String> requestMap);

}
