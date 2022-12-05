package com.etiya.ecommercedemopair3.business.dtos.response.customer;

import com.etiya.ecommercedemopair3.entities.concrets.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddCustomerResponse {
    private  int id;
    private int customerNumber;
    private Cart cart;
}
