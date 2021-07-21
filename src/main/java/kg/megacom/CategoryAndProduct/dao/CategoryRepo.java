package kg.megacom.CategoryAndProduct.dao;

import kg.megacom.CategoryAndProduct.models.Category;
import kg.megacom.CategoryAndProduct.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
