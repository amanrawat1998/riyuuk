package com.mindtree.covid.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.covid.constants.Health;
import com.mindtree.covid.entity.District;

public class PatientDto {

	@NotBlank(message = "Name cannot be empty")
	private String name;
	
	@NotBlank(message = "Name cannot be empty")
	@Size(min = 12, max = 12, message = "Give 12 number input")
	private String adhar;
	
	private Health health;
	
	@JsonIgnore
	private District district;

	public PatientDto() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public Health getCondition() {
		return health;
	}

	public void setCondition(Health condition) {
		this.health = condition;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "PatientDto [name=" + name + ", adhar=" + adhar + ", health=" + health + ", district=" + district
				+ "]";
	}
}
