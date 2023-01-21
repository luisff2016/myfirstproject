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
	Category cat1 = new Category(null, "Televisao");
	Category cat2 = new Category(null, "Notebook");
	
	Product p1 = new Product(null, "TV20", 2100.00, cat1);
	Product p2 = new Product(null, "ACER I5", 2200.00, cat2);
	Product p3 = new Product(null, "TV40", 2300.00, cat1);
	Product p4 = new Product(null, "NITRO5", 2400.00, cat2);
	
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
