package com.example.cmsshoppingcart.models;

import com.example.cmsshoppingcart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PageRepository extends JpaRepository<Page, Integer> {

    Page findBySlug(String slug);

//    @Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
//    Page findBySlug(int id, String slug);

    Page findBySlugAndIdNot(String slug, int id); // do the same as the lines 12, 13

    List<Page> findAllByOrderBySortingAsc();

}
