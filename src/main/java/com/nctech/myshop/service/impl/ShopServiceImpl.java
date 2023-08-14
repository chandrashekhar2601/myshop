package com.nctech.myshop.service.impl;

import com.nctech.myshop.dto.Shop;
import com.nctech.myshop.repository.ShopRepository;
import com.nctech.myshop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop findById(Integer id) {
        return shopRepository.findById(id).orElse(new Shop());
    }

    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Shop update(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        shopRepository.deleteById(id);
    }

}
