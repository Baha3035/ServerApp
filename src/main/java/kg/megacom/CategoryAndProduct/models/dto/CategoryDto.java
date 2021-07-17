package kg.megacom.CategoryAndProduct.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private boolean active;
}
