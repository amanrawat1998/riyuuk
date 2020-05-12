package com.mindtree.covid.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.covid.dto.DistrictDto;
import com.mindtree.covid.dto.ResponseBody;
import com.mindtree.covid.entity.District;
import com.mindtree.covid.exceptions.CovidApplicationException;
import com.mindtree.covid.service.DistrictService;

@RestController
@RequestMapping("/district")
public class DistrictController {

	@Autowired
	private ModelMapper model;

	@Autowired
	private DistrictService service;

	@PostMapping("/add")
	public ResponseEntity<?> addNewDistrict(@Valid @RequestBody DistrictDto district) throws CovidApplicationException {
		return new ResponseEntity<ResponseBody<DistrictDto>>(new ResponseBody<DistrictDto>(
				model.map(service.addNewDistrict(model.map(district, District.class)), DistrictDto.class), null, true),
				HttpStatus.OK);
	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllDistricts() throws CovidApplicationException {
		return new ResponseEntity<ResponseBody<List<DistrictDto>>>(new ResponseBody<List<DistrictDto>>(
				model.map(service.getAllDistricts(), new TypeToken<List<DistrictDto>>() {

				}.getType()), null, true), HttpStatus.OK);
	}
	
}
