package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.business.dtos.request.city.AddCityRequest;
import com.etiya.ecommercedemopair3.business.dtos.response.city.AddCityResponse;

public interface CityService {
    AddCityResponse addCity(AddCityRequest addCityRequest);
}
