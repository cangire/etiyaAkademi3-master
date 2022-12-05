package com.etiya.ecommercedemopair3.api.controllers;

import com.etiya.ecommercedemopair3.business.abstracts.ProductService;
import com.etiya.ecommercedemopair3.business.dtos.request.PaymentType.AddPaymentTypeRequest;
import com.etiya.ecommercedemopair3.business.dtos.request.product.AddProductRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.PaymentType.AddPaymentTypeResponse;
import com.etiya.ecommercedemopair3.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    //dependency incejtion
    ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable int id){
        return productService.getById(id);
    }
    @PostMapping("/add")
    public ResponseEntity<AddProductResponse> addProduct(@RequestBody AddProductRequest addProductRequest)
    {
        return  new ResponseEntity<AddProductResponse>(productService.addProduct(addProductRequest), HttpStatus.CREATED);
    }
}
