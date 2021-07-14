package com.example.springboot.loader;

import com.example.springboot.entities.Category;
import com.example.springboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    @Autowired
    public DatabaseLoader(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public  void run(String... args) throws  Exception{
        if(this.categoryRepository.count()==0)
        {
            this.categoryRepository.save(new Category("Food"));
            this.categoryRepository.save(new Category("Smartphone"));
        }
    }
}
