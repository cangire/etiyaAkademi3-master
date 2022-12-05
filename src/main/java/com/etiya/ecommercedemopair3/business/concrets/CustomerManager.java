package com.etiya.ecommercedemopair3.business.concrets;

import com.etiya.ecommercedemopair3.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair3.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.customer.AddCustomerResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Customer;
import com.etiya.ecommercedemopair3.repository.abstracts.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    CustomerRepository customerRepository;

    @Override
    public AddCustomerResponse addCustomer(AddCustomerRequest addCustomerRequest) {
        Customer customer =new Customer();
        customer.setCustomerNumber(addCustomerRequest.getCustomerNumber());
        customer.setCart(addCustomerRequest.getCart());
        Customer savedCustomer=customerRepository.save(customer);
        AddCustomerResponse response=new AddCustomerResponse(savedCustomer.getId(),savedCustomer.getCustomerNumber(),savedCustomer.getCart());
  return  response;
    }
}
