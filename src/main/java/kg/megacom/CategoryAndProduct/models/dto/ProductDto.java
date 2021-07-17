package kg.megacom.CategoryAndProduct.models.dto;

import kg.megacom.CategoryAndProduct.models.Category;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private CategoryDto categoryDto;
}
