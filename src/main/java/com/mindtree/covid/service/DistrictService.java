package com.mindtree.covid.service;

import java.util.List;

import com.mindtree.covid.entity.District;
import com.mindtree.covid.exceptions.service.CovidServiceException;

public interface DistrictService {

	public District addNewDistrict(District district) throws CovidServiceException;

	public List<District> getAllDistricts();

}
