package kg.megacom.CategoryAndProduct.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseCrudController<S, T> {
    @GetMapping("/findAll")
    List<S> findAll();

    @PostMapping("/save")
    S save(@RequestBody S s);

    @PutMapping("/update")
    S update(@RequestBody S s);

    @GetMapping("/{id}")
    S findById(@PathVariable T t);
}
