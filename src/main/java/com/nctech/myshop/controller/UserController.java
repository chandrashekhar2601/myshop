package com.nctech.myshop.controller;

import com.nctech.myshop.dto.User;
import com.nctech.myshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("update")
    public User update(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("find/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @GetMapping("find")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id);
    }
}
