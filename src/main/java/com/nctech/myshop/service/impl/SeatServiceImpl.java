package com.nctech.myshop.service.impl;

import com.nctech.myshop.dto.Seat;
import com.nctech.myshop.repository.SeatRepository;
import com.nctech.myshop.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public Seat findById(Integer id) {
        return seatRepository.findById(id).orElse(new Seat());
    }

    @Override
    public Seat save(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public Seat update(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> findAll() {
        return seatRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        seatRepository.deleteById(id);
    }

}
