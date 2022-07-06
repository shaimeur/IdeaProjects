package com.shaimeur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    //http://localhost:8080/springmvcxml_war/product/listProducts?categoryId=1&categoryName=computer
    @GetMapping("/listProducts")
    public String getProductByCategory(@RequestParam String categoryId, @RequestParam(value = "categoryName", required = false, defaultValue = "laptop") String name) {

        System.out.println("Id :" + categoryId + ", Name: " + name);
        return "welcome";
    }

    // https://localhost:8080/product/categoryId/2/categoryName/computer
    @GetMapping("/categoryId/{cateId}/categoryName/{catName}")

    public String getProducts(@PathVariable String cateId, @PathVariable("catName") String name) {

        System.out.println("category Id :" + cateId + ", Name: " + name);

        return "welcome";
    }

    @PostMapping("/save")
    public String saveProduct() {
        return "welcome";
    }
}
