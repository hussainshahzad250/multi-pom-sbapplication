package com.shahzad.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahzad.model.Doctor;
import com.shahzad.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private EmailService emailService;

	@Autowired
	private DoctorRepository repository;

	@PostConstruct
	public void initDoctor() {
		repository.saveAll(Stream.of(new Doctor(101, "Shahzad", "Chest"), new Doctor(102, "Ejaz", "eye"))
				.collect(Collectors.toList()));
	}

	public List<Doctor> getDoctors() {
		emailService.sendEMail();
		return repository.findAll();
	}
}
