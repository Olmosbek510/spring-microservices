package com.olmoscode.customer.service.impl;

import com.olmoscode.customer.entity.Customer;
import com.olmoscode.customer.model.request.CustomerRegistrationRequest;
import com.olmoscode.customer.service.CustomerService;
import com.olmoscode.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public void registerCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        // todo: check if email valid
        // todo:check if email not taken
        customerRepository.save(customer);
    }
}
