package kg.megacom.CategoryAndProduct.services.impl;

import kg.megacom.CategoryAndProduct.dao.ProductRepo;
import kg.megacom.CategoryAndProduct.mappers.ProductMapper;
import kg.megacom.CategoryAndProduct.models.Product;
import kg.megacom.CategoryAndProduct.models.dto.ProductDto;
import kg.megacom.CategoryAndProduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ProductDto> findAll() {
        return ProductMapper.INSTANCE.toDtos(productRepo.findAll());
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        product = productRepo.save(product);
        return ProductMapper.INSTANCE.toDto(product);
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        if(!productRepo.existsById(productDto.getId())){
            throw new RuntimeException("Product can't be found!");
        }

        Product product = ProductMapper.INSTANCE.toEntity(productDto);
        product = productRepo.save(product);
        return ProductMapper.INSTANCE.toDto(product);
    }

    @Override
    public ProductDto findById(Long id) {
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Position can't be found!"));
        return ProductMapper.INSTANCE.toDto(product);
    }
}
