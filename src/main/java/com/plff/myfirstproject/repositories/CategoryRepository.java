package com.plff.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plff.myfirstproject.entites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
