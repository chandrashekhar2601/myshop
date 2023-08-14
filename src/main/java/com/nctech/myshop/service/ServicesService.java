package com.nctech.myshop.service;

import com.nctech.myshop.dto.Services;

import java.util.List;

public interface ServicesService {
    public Services findById(Integer id);
    public Services save(Services services);
    public Services update(Services services);
    public List<Services> findAll();
    public void delete(Integer id);
}
