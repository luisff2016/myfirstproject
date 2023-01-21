package com.plff.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plff.myfirstproject.entites.Category;
import com.plff.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Category cat1 = new Category(1L, "Televisao");
	Category cat2 = new Category(2L, "Notebook");
	Category cat3 = new Category(3L, "Celular");
	categoryRepository.save(cat1);
	categoryRepository.save(cat2);
	categoryRepository.save(cat3);
		
	}

}
