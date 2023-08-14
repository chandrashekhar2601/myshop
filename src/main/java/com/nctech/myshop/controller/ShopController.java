package com.nctech.myshop.controller;

import com.nctech.myshop.dto.Shop;
import com.nctech.myshop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("save")
    public Shop save(@RequestBody Shop shop) {
        return shopService.save(shop);
    }

    @PostMapping("update")
    public Shop update(@RequestBody Shop shop) {
        return shopService.save(shop);
    }

    @GetMapping("find/{id}")
    public Shop findById(@PathVariable("id") Integer id) {
        return shopService.findById(id);
    }

    @GetMapping("find")
    public List<Shop> findAll() {
        return shopService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        shopService.delete(id);
    }
}
