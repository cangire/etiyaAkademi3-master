package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.product.AddProductRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);


    AddProductResponse addProduct(AddProductRequest addProductRequest);
}
