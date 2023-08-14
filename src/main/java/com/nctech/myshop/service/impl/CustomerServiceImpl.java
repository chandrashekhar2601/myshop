package com.nctech.myshop.service.impl;

import com.nctech.myshop.dto.Customer;
import com.nctech.myshop.repository.CustomerRepository;
import com.nctech.myshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(new Customer());
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }
}
