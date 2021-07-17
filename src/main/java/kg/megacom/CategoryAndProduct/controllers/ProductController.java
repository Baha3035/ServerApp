package kg.megacom.CategoryAndProduct.controllers;

import kg.megacom.CategoryAndProduct.models.dto.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController implements BaseCrudController<ProductDto, Long> {

    @Override
    public List<ProductDto> findAll() {
        return null;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto findById(Long aLong) {
        return null;
    }
}
