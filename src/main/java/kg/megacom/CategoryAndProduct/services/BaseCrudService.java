package kg.megacom.CategoryAndProduct.services;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseCrudService<S, T> {
    List<S> findAll();
    S save(S s);
    S update(S s);
    S findById(T t);
}
