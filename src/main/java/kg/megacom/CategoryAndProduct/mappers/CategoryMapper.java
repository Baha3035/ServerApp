package kg.megacom.CategoryAndProduct.mappers;

import kg.megacom.CategoryAndProduct.models.Category;
import kg.megacom.CategoryAndProduct.models.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category toEntity(CategoryDto categoryDto);
    CategoryDto toDto(Category category);


    List<CategoryDto> toDtos(List<Category> categories);
    List<Category> toEntities(List<CategoryDto> categoryDtos);
}
