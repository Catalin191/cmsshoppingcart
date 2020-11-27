package com.example.cmsshoppingcart.models;

import com.example.cmsshoppingcart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PageRepository extends JpaRepository<Page, Integer> {


}
