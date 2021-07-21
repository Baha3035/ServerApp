package kg.megacom.CategoryAndProduct.services.impl;

import kg.megacom.CategoryAndProduct.dao.CategoryRepo;
import kg.megacom.CategoryAndProduct.exceptions.ResourceNotFoundException;
import kg.megacom.CategoryAndProduct.mappers.CategoryMapper;
import kg.megacom.CategoryAndProduct.models.Category;
import kg.megacom.CategoryAndProduct.models.dto.CategoryDto;
import kg.megacom.CategoryAndProduct.services.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryMapper categoryMapper;

    private CategoryRepo categoryRepo;

    private CategoryServiceImpl(CategoryMapper categoryMapper,CategoryRepo categoryRepo){
        this.categoryMapper = categoryMapper;
        this.categoryRepo = categoryRepo;
    }
    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category category = categoryMapper.toEntity(categoryDto);
        category = categoryRepo.save(category);
        return categoryMapper.toDto(category);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto) {

        if (!categoryRepo.existsById(categoryDto.getId())){
            throw new ResourceNotFoundException("Категория не найдена!");
        }

        Category category = categoryMapper.toEntity(categoryDto);
        category = categoryRepo.save(category);
        return categoryMapper.toDto(category);
    }

    @Override
    public CategoryDto findById(Long id) {
        Category category = categoryRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Категория не найдена!"));
        return categoryMapper.toDto(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryMapper.toDtos(categoryRepo.findAll());
    }
}
