package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.adress.AddAdressRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.adress.AddAdressResponse;
import com.etiya.ecommercedemopair3.entities.concrets.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAll();
    Address getById(int id);
    List<Address> getAllAddressByTitle(String title);
    Address findByDescription(String description);

    //AddAdressResponse addAdress(AddAdressRequest addAdressRequest);
}
