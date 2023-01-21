package com.plff.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plff.myfirstproject.entites.Category;
import com.plff.myfirstproject.entites.Product;
import com.plff.myfirstproject.repositories.CategoryRepository;
import com.plff.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Category cat1 = new Category(1L, "Televisao");
	Category cat2 = new Category(2L, "Notebook");
	
	Product p1 = new Product(1L, "TV20", 2100.00, cat1);
	Product p2 = new Product(2L, "ACER I5", 2200.00, cat2);
	Product p3 = new Product(3L, "TV40", 2300.00, cat1);
	Product p4 = new Product(4L, "NITRO5", 2400.00, cat2);
	
	cat1.getProducts().addAll(Arrays.asList(p1,p3));
	cat2.getProducts().addAll(Arrays.asList(p2,p4));
	
	categoryRepository.save(cat1);
	categoryRepository.save(cat2);
	
	productRepository.save(p1);
	productRepository.save(p2);
	productRepository.save(p3);
	productRepository.save(p4);
		
	}

}
