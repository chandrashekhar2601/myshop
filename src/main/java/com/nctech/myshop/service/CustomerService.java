package com.nctech.myshop.service;

import com.nctech.myshop.dto.Customer;

import java.util.List;

public interface CustomerService {

    public Customer save(Customer customer);

    public Customer update(Customer customer);

    public Customer findById(Integer id);

    public List<Customer> findAll();

    public void delete(Integer id);
}
