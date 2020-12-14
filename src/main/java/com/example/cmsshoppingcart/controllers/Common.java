package com.example.cmsshoppingcart.controllers;

import com.example.cmsshoppingcart.models.CategoryRepository;
import com.example.cmsshoppingcart.models.PageRepository;
import com.example.cmsshoppingcart.models.data.Category;
import com.example.cmsshoppingcart.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class Common {

    @Autowired
    private PageRepository pageRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @ModelAttribute
    public void sharedData(Model model){

        List<Page> pages = pageRepo.findAllByOrderBySortingAsc();

        List<Category> categories = categoryRepo.findAll();

        model.addAttribute("cpages", pages);
        model.addAttribute("ccategories", categories);

    }
}
