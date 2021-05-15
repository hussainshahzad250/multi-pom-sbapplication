package com.shahzad.controller;

import com.shahzad.config.AppProperties;
import com.shahzad.model.Doctor;
import com.shahzad.service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	@Autowired
	private AppProperties properties;

	@GetMapping("/doctors")
	public List<Doctor> getDoctors() {
		return service.getDoctors();
	}

	@GetMapping("/getRegion")
	public String getRegion() {
		return properties.getName();
	}

}
