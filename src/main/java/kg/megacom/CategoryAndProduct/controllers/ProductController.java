package kg.megacom.CategoryAndProduct.controllers;

import kg.megacom.CategoryAndProduct.models.dto.ProductDto;
import kg.megacom.CategoryAndProduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController implements BaseCrudController<ProductDto, Long> {

    @Autowired
    private ProductService productService;

    @Override
    public List<ProductDto> findAll() {
        return productService.findAll();
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        return productService.save(productDto);
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        return productService.update(productDto);
    }

    @Override
    public ProductDto findById(Long id) {
        return productService.findById(id);
    }
}
