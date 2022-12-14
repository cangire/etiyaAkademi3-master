package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Category;

import java.util.List;
import java.util.Locale;

public interface CategoryService {
    List<Category> getAll();

    AddCategoryResponse addCategory(AddCategoryRequest addCategoryRequest);
}
