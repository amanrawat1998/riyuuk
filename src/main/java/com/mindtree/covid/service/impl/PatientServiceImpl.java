package com.mindtree.covid.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.covid.entity.District;
import com.mindtree.covid.entity.Patient;
import com.mindtree.covid.exceptions.custom.DistrictException;
import com.mindtree.covid.exceptions.custom.PatientException;
import com.mindtree.covid.exceptions.service.CovidServiceException;
import com.mindtree.covid.repository.DistrictRepository;
import com.mindtree.covid.repository.PatientRepository;
import com.mindtree.covid.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repository;
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Override
	public Patient addNewPatient(Patient patient, long districtId) throws CovidServiceException {
		Patient pat = repository.findById(patient.getId()).orElse(null);
		District district = districtRepository.findById(districtId).orElseThrow(() -> new DistrictException("No District with Given id"));
		if(pat != null) {
			throw new PatientException("Patient is Already Present.");
		}
		patient.setDistrict(district);
		return repository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return repository.findAll();
	}

	@Override
	public List<Object> countPatientByDistrict() throws CovidServiceException {
//		 System.out.println(repository.countPatientByDistrict().toString());
//		System.out.println(count.toString());
		 return repository.countPatientByDistrict();
	}
	
	
}
