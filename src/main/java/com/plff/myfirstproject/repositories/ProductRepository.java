package com.plff.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plff.myfirstproject.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

	

}
