package com.etiya.ecommercedemopair3.business.concrets;

import com.etiya.ecommercedemopair3.business.abstracts.IndividualCustomerService;
import com.etiya.ecommercedemopair3.business.dtos.request.IndividualCustomerr.AddIndividualCustomerRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.IndividualCustomer.AddIndividualCustomerResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Customer;
import com.etiya.ecommercedemopair3.entities.concrets.IndividualCustomer;
import com.etiya.ecommercedemopair3.repository.abstracts.CustomerRepository;
import com.etiya.ecommercedemopair3.repository.abstracts.IndividualCustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class IndividualCustomerManager implements IndividualCustomerService {
    IndividualCustomerRepository individualCustomerRepository;
    CustomerRepository customerRepository;
    @Override
    public List<IndividualCustomer> getAll() {
        return individualCustomerRepository.findAll();
    }

    @Override
    public IndividualCustomer getById(int id) {
        return individualCustomerRepository.findById(id).orElseThrow();
    }

    @Override
    public IndividualCustomer getIndividualCustomerBynationalIdentity(String nationalIdentity) {
        return individualCustomerRepository.findIndividualCustomerBynationalIdentity(nationalIdentity);
    }

    @Override
    public List<IndividualCustomer> getIndividualCustomerByFirstName(String firstName) {
        return individualCustomerRepository.findIndividualCustomerByFirstName(firstName);
    }

    @Override
    public AddIndividualCustomerResponse addIndividualCustomer(AddIndividualCustomerRequest addIndividualCustomerRequest) {
       IndividualCustomer individualCustomer=new IndividualCustomer();
       individualCustomer.setCustomerNumber(addIndividualCustomerRequest.getCustomerNumber());
       individualCustomer.setFirstName(addIndividualCustomerRequest.getFirstName());
       individualCustomer.setLastName(addIndividualCustomerRequest.getLastName());
       individualCustomer.setNationalIdentity(addIndividualCustomerRequest.getNationalIdentity());
       //Customer no için customer repository yapılacak.
      IndividualCustomer savedIndividualCustomer= individualCustomerRepository.save(individualCustomer);

        AddIndividualCustomerResponse response=new AddIndividualCustomerResponse(savedIndividualCustomer.getId(),savedIndividualCustomer.getFirstName(),savedIndividualCustomer.getLastName(),savedIndividualCustomer.getNationalIdentity());


       return  response;
    }
}
