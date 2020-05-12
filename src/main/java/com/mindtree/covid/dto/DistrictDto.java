package com.mindtree.covid.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.covid.entity.Patient;

public class DistrictDto {

	@NotBlank(message = "Cannot be empty")
	@Size(max = 20, message = "District size is too big")
	private String name;
	
	@JsonIgnore
	private List<Patient> patients;

	public DistrictDto() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "DistrictDto [name=" + name + ", patients=" + patients + "]";
	}
}
