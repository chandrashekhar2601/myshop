package com.nctech.myshop.service;

import com.nctech.myshop.dto.Shop;

import java.util.List;

public interface ShopService {
    public Shop findById(Integer id);
    public Shop save(Shop shop);
    public Shop update(Shop shop);
    public List<Shop> findAll();
    public void delete(Integer id);
}
