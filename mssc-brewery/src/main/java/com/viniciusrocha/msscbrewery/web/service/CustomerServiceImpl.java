package com.viniciusrocha.msscbrewery.web.service;

import com.viniciusrocha.msscbrewery.web.model.BeerDto;
import com.viniciusrocha.msscbrewery.web.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getById(UUID customerId) {
        return Customer.builder().id(UUID.randomUUID()).name("Vinicius Rocha").build();
    }

    @Override
    public Customer createCustomer(Customer customer) {

        return customer.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a Customer..");
    }
}
