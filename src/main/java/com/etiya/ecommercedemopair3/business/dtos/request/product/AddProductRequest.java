package com.etiya.ecommercedemopair3.business.dtos.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddProductRequest {
    private String name;
    private double unit_price;
    private int stock;
}
