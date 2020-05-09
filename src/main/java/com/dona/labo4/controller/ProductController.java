package com.dona.labo4.controller;

import java.util.ArrayList;
import java.util.List;

import com.dona.labo4.domain.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ProductController {
    
    private List<Product> products = new ArrayList<>();

    @GetMapping(value="/compraProducto")
    public ModelAndView compraProducto() {
        ModelAndView modelAndView = new ModelAndView();

        products.add(new Product(0,"GTAS",60));
        products.add(new Product(1,"Minecraft",20));
        products.add(new Product(2,"WOW",10));
        products.add(new Product(3,"COD",8));
        products.add(new Product(4,"Animal Crossing",20));

        modelAndView.setViewName("select");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("products", products);


        return modelAndView;
    }

    @PostMapping(value="/validar")
    public ModelAndView validar(Product product) {
        ModelAndView modelAndView = new ModelAndView();
        Product foundProduct = products.get(product.getId());
        if(foundProduct.getCantidad() >= product.getCantidad()){
            foundProduct.setCantidad(foundProduct.getCantidad() - product.getCantidad());
            modelAndView.setViewName("result");
            modelAndView.addObject("product", foundProduct);
        }
        else modelAndView.setViewName("error");
        
        return modelAndView;
    }
    
    
}