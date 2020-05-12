package com.mindtree.covid.controller;

import java.util.List;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.covid.dto.DistrictDto;
import com.mindtree.covid.dto.PatientDto;
import com.mindtree.covid.dto.ResponseBody;
import com.mindtree.covid.entity.Patient;
import com.mindtree.covid.exceptions.CovidApplicationException;
import com.mindtree.covid.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private ModelMapper model;

	@Autowired
	private PatientService service;

	@PostMapping("/add/{districtId}")
	public ResponseEntity<?> addNewPatient(@Valid @RequestBody PatientDto patient, @PathVariable long districtId)
			throws CovidApplicationException {
		return new ResponseEntity<ResponseBody<DistrictDto>>(new ResponseBody<DistrictDto>(
				model.map(service.addNewPatient(model.map(patient, Patient.class), districtId), PatientDto.class), null,
				true), HttpStatus.OK);
	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllPatients() throws CovidApplicationException {
		return new ResponseEntity<ResponseBody<List<PatientDto>>>(new ResponseBody<List<PatientDto>>(
				model.map(service.getAllPatients(), new TypeToken<List<PatientDto>>() {

				}.getType()), false, true), HttpStatus.OK);
	}

	@GetMapping("/patientCount")
	public ResponseEntity<?> getPatientCount() throws CovidApplicationException {
		return new ResponseEntity<List<Object>>(service.countPatientByDistrict(), HttpStatus.OK);
	}
}
