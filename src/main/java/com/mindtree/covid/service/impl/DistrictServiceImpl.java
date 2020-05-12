package com.mindtree.covid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.covid.entity.District;
import com.mindtree.covid.exceptions.custom.DistrictException;
import com.mindtree.covid.exceptions.service.CovidServiceException;
import com.mindtree.covid.repository.DistrictRepository;
import com.mindtree.covid.service.DistrictService;

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictRepository repository;
	
	@Override
	public District addNewDistrict(District district) throws CovidServiceException {
		District dist = repository.findById(district.getId()).orElse(null);
		if(dist != null) {
			throw new DistrictException("District is Already Present.");
		}
		return repository.save(district);
	}

	@Override
	public List<District> getAllDistricts() {
		return repository.findAll();
	}

}
