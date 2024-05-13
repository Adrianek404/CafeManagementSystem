package pl.adrianek.cafe_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adrianek.cafe_management_system.POJO.Category;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {

    List<Category> getAllCategory();
}
