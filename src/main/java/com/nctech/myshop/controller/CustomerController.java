package com.nctech.myshop.controller;

import com.nctech.myshop.dto.Customer;
import com.nctech.myshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PostMapping("update")
    public Customer update(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("find/{id}")
    public Customer findById(@PathVariable("id") Integer id) {
        return customerService.findById(id);
    }

    @GetMapping("find")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        customerService.delete(id);
    }
}
