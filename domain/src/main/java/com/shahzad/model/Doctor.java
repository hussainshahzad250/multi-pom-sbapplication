package com.shahzad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	@Id
	private int id;
	private String name;
	private String specialist;
}
