package kg.megacom.CategoryAndProduct.controllers;

import kg.megacom.CategoryAndProduct.models.dto.CategoryDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/category")
public class CategoryController implements BaseCrudController<CategoryDto, Long>{
    @Override
    public List<CategoryDto> findAll() {
        return null;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto findById(Long aLong) {
        return null;
    }
}
