package pl.adrianek.cafe_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adrianek.cafe_management_system.POJO.Product;
import pl.adrianek.cafe_management_system.wrapper.ProductWrapper;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();

}
