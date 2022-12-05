package com.etiya.ecommercedemopair3.business.dtos.request.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddPaymentTypeRequest {
    private String name;
    private String description;
}
