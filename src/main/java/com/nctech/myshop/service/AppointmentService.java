package com.nctech.myshop.service;

import com.nctech.myshop.dto.Appointment;

import java.util.List;

public interface AppointmentService {

    public Appointment findById(Integer id);

    public Appointment save(Appointment appointment);

    public Appointment update(Appointment appointment);

    public List<Appointment> findAll();

    public void delete(Integer id);
}


