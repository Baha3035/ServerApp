package kg.megacom.CategoryAndProduct.mappers;

import kg.megacom.CategoryAndProduct.models.Category;
import kg.megacom.CategoryAndProduct.models.Product;
import kg.megacom.CategoryAndProduct.models.dto.CategoryDto;
import kg.megacom.CategoryAndProduct.models.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product toEntity(ProductDto productDto);
    ProductDto toDto(Product product);


    List<ProductDto> toDtos(List<Product> products);
    List<Product> toEntities(List<ProductDto> productDtos);
}
