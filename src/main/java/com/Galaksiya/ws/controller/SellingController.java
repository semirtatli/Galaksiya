package com.Galaksiya.ws.controller;

import com.Galaksiya.ws.model.Product;
import com.Galaksiya.ws.model.Selling;
import com.Galaksiya.ws.model.SoldProduct;
import com.Galaksiya.ws.service.ProductService;
import com.Galaksiya.ws.service.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// SellingController sınıfı, satış işlemleriyle ilgili HTTP requestlerine yanıt veren REST API işlemlerini gerçekleştirir
@RestController
public class SellingController {
    // SellingService ve ProductService sınıflarını otomatik olarak enjekte eder.
    @Autowired
    SellingService sellingService;
    @Autowired
    private ProductService productService;
    public SellingController(SellingService sellingService, ProductService productService) {
        this.sellingService = sellingService;
        this.productService = productService;
    }




    @PostMapping("api/orders")
    public ResponseEntity<Selling> createOrder(@RequestBody Selling selling) {
        System.out.println(selling);

        // Iterate through the list of sold products in the Selling object
        for (SoldProduct soldProduct : selling.getSoldProducts()) {
            // Find the existing product by its ID
            Optional<Product> existingProduct = productService.findById(soldProduct.getProduct().getId());

            if (existingProduct.isPresent()) {
                Product productToUpdate = existingProduct.get();
                // Update the product stock based on the quantity sold
                productToUpdate.setProductStock(productToUpdate.getProductStock() - soldProduct.getNumberOfProduct());
                // Save the updated product
                productService.save(productToUpdate);
            }
        }

        // Save the order (Selling entity)
        sellingService.save(selling);

        return ResponseEntity.ok(selling);
    }





    // Tüm selling kayıtlarını listeleyen HTTP GET request
    @GetMapping("api/orders")
    public List<Selling> getAllSelling() {
        return sellingService.findAll();
    }



}
