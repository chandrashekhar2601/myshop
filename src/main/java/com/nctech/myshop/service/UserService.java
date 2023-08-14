package com.nctech.myshop.service;

import com.nctech.myshop.dto.User;

import java.util.List;

public interface UserService{
    public User findById(Integer id);
    public User save(User user);
    public User update(User user);
    public List<User> findAll();
    public void delete(Integer id);
}
