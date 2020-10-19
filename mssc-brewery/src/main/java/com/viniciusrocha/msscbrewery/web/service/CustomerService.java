package com.viniciusrocha.msscbrewery.web.service;

import com.viniciusrocha.msscbrewery.web.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Service
public interface CustomerService {

    Customer getById(UUID customerId);

    Customer createCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);

    void deleteById(UUID customerId);
}
