package com.olmoscode.customer.service;

import com.olmoscode.customer.model.request.CustomerRegistrationRequest;

public interface CustomerService {
    void registerCustomer(CustomerRegistrationRequest customerRequest);
}
