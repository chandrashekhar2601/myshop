package com.nctech.myshop.controller;

import com.nctech.myshop.dto.Appointment;
import com.nctech.myshop.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment/")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("save")
    public Appointment save(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @PostMapping("update")
    public Appointment update(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @GetMapping("find/{id}")
    public Appointment findById(@PathVariable("id") Integer id) {
        return appointmentService.findById(id);
    }

    @GetMapping("find")
    public List<Appointment> findAll() {
        return appointmentService.findAll();
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        appointmentService.delete(id);
    }
}
