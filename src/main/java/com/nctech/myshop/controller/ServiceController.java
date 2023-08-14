package com.nctech.myshop.controller;

import com.nctech.myshop.dto.Services;
import com.nctech.myshop.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/")
public class ServiceController {

    @Autowired
    private ServicesService serviceService;

    @PostMapping("save")
    public Services save(@RequestBody Services service) {
        return serviceService.save(service);
    }

    @PostMapping("update")
    public Services update(@RequestBody Services service) {
        return serviceService.save(service);
    }

    @GetMapping("find/{id}")
    public Services findById(@PathVariable("id") Integer id) {
        return serviceService.findById(id);
    }

    @GetMapping("find")
    public List<Services> findAll() {
        return serviceService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        serviceService.delete(id);
    }
}
