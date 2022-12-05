package com.etiya.ecommercedemopair3.business.dtos.request.adress;

import com.etiya.ecommercedemopair3.entities.concrets.City;
import com.etiya.ecommercedemopair3.entities.concrets.Country;
import com.etiya.ecommercedemopair3.entities.concrets.Customer;
import com.etiya.ecommercedemopair3.entities.concrets.Street;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddAdressRequest {
    private String description;


    private int customer_id;


    private int city_id;


    private int country_id;

    private int street_id;
}
