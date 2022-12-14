package com.etiya.ecommercedemopair3.api.controllers;

import com.etiya.ecommercedemopair3.business.abstracts.IndividualCustomerService;
import com.etiya.ecommercedemopair3.business.dtos.request.IndividualCustomerr.AddIndividualCustomerRequest;
import com.etiya.ecommercedemopair3.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.IndividualCustomer.AddIndividualCustomerResponse;
import com.etiya.ecommercedemopair3.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemopair3.entities.concrets.IndividualCustomer;
import com.etiya.ecommercedemopair3.entities.concrets.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/IndividualCustomer")
@AllArgsConstructor
public class IndividualCustomersController {
    IndividualCustomerService individualCustomerService;

    @GetMapping("/getAll")
    public List<IndividualCustomer> getAll(){
        return individualCustomerService.getAll();
    }

    @GetMapping("{id}")
    public IndividualCustomer getById(@PathVariable int id){
        return individualCustomerService.getById(id);
    }

    @GetMapping("/firstName")
    public List<IndividualCustomer> getIndividualCustomerByFirstName(@RequestParam("firstName") String firstName){
        return individualCustomerService.getIndividualCustomerByFirstName(firstName);}

    @GetMapping("/nationalIdentity")
    public IndividualCustomer getIndividualCustomerBynationalIdentity(@RequestParam("nationalIdentity") String nationalIdentity){
        return individualCustomerService.getIndividualCustomerBynationalIdentity(nationalIdentity)
        ;}
    @PostMapping("/add")
    public ResponseEntity<AddIndividualCustomerResponse> addIndividualCustomer(@RequestBody AddIndividualCustomerRequest addIndividualCustomerRequest)
    {
        return  new ResponseEntity<AddIndividualCustomerResponse>(individualCustomerService.addIndividualCustomer(addIndividualCustomerRequest), HttpStatus.CREATED);
    }
}
