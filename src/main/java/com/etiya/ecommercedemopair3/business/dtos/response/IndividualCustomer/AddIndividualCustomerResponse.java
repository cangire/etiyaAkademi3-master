package com.etiya.ecommercedemopair3.business.dtos.response.IndividualCustomer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddIndividualCustomerResponse {
    private int Id;
    private String firstName;
    private String lastName;
    private String nationalIdentity;
}
