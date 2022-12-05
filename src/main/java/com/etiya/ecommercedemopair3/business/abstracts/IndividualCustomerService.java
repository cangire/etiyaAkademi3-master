package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.IndividualCustomerr.AddIndividualCustomerRequest;
import com.etiya.ecommercedemopair3.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.IndividualCustomer.AddIndividualCustomerResponse;
import com.etiya.ecommercedemopair3.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair3.entities.concrets.IndividualCustomer;
import com.etiya.ecommercedemopair3.entities.concrets.Product;

import java.util.List;

public interface IndividualCustomerService {
    List<IndividualCustomer> getAll();
    IndividualCustomer getById(int id);
    IndividualCustomer getIndividualCustomerBynationalIdentity(String nationalIdentity);
    List<IndividualCustomer> getIndividualCustomerByFirstName(String firstName);

    AddIndividualCustomerResponse addIndividualCustomer(AddIndividualCustomerRequest addIndividualCustomerRequest);
}
