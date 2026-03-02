package com.productApp.controller;

import com.productApp.model.Product;
import com.productApp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/products")
@SessionAttributes("product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ModelAttribute("product")
    public Product getProduct() {
        return new Product();
    }

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/add")
    public String showAddForm(){
        return "product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, SessionStatus status){
        if(result.hasErrors()){
            return "product-form";
        }
        productService.saveProduct(product);
        status.setComplete();
        return "redirect:/products/list";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable() Long id, Model model){
        Product product1 = productService.getProductById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        model.addAttribute("product", product1);
        return "product-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable() Long id){
        if(productService.getProductById(id).isEmpty()){
            throw new RuntimeException("Cannot Delete. Product not found");
        }
        productService.deleteProduct(id);
        return "redirect:/products/list";
    }

    @GetMapping("/count")
    @ResponseBody
    public String count(){
        return "Total Products: " + productService.getAllProducts().size();
    }

//    @ExceptionHandler(RuntimeException.class)
//    public String handleException(RuntimeException ex, Model model){
//        model.addAttribute("errorMessage", ex.getMessage());
//        return "error-page";
//    }

}
