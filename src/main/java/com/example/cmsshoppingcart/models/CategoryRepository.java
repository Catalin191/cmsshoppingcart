package com.example.cmsshoppingcart.models;

import com.example.cmsshoppingcart.models.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

    List<Category> findAllByOrderBySortingAsc();
}
