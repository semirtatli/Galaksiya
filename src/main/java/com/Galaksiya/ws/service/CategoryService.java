package com.Galaksiya.ws.service;




import com.Galaksiya.ws.repository.CategoryRepository;
import com.Galaksiya.ws.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    //Category registered to Repository
    public void save(Category category) {

        categoryRepository.save(category);

    }
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public void delete(Category category) {
        categoryRepository.delete(category);
    }
}