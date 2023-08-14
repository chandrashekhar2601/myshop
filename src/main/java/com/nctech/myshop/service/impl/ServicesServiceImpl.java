package com.nctech.myshop.service.impl;

import com.nctech.myshop.dto.Services;
import com.nctech.myshop.repository.ServiceRepository;
import com.nctech.myshop.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Services findById(Integer id) {
        return serviceRepository.findById(id).orElse(new Services());
    }

    @Override
    public Services save(Services services) {
        return serviceRepository.save(services);
    }

    @Override
    public Services update(Services services) {
        return serviceRepository.save(services);
    }

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        serviceRepository.deleteById(id);
    }

}
