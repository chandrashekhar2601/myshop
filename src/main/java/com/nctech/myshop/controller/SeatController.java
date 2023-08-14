package com.nctech.myshop.controller;

import com.nctech.myshop.dto.Seat;
import com.nctech.myshop.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat/")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping("save")
    public Seat save(@RequestBody Seat seat) {
        return seatService.save(seat);
    }

    @PostMapping("update")
    public Seat update(@RequestBody Seat seat) {
        return seatService.save(seat);
    }

    @GetMapping("find/{id}")
    public Seat findById(@PathVariable("id") Integer id) {
        return seatService.findById(id);
    }

    @GetMapping("find")
    public List<Seat> findAll() {
        return seatService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        seatService.delete(id);
    }
}
