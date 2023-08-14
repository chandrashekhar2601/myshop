package com.nctech.myshop.service;

import com.nctech.myshop.dto.Seat;

import java.util.List;

public interface SeatService {
    public Seat findById(Integer id);
    public Seat save(Seat seat);
    public Seat update(Seat seat);
    public List<Seat> findAll();
    public void delete(Integer id);
}
