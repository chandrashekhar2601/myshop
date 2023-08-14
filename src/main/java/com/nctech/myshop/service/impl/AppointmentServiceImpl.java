package com.nctech.myshop.service.impl;

import com.nctech.myshop.dto.Appointment;
import com.nctech.myshop.repository.AppointmentRepository;
import com.nctech.myshop.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment findById(Integer id) {
        return appointmentRepository.findById(id).orElse(new Appointment());
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        appointmentRepository.deleteById(id);
    }
}
