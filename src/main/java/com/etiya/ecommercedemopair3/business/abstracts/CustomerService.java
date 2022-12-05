package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.customer.AddCustomerResponse;

public interface CustomerService {

    AddCustomerResponse addCustomer(AddCustomerRequest addCustomerRequest);

}
