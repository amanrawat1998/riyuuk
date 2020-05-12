package com.mindtree.covid.service;

import java.util.List;
import com.mindtree.covid.entity.Patient;
import com.mindtree.covid.exceptions.service.CovidServiceException;

public interface PatientService {

	public Patient addNewPatient(Patient patient, long districtId) throws CovidServiceException;

	public List<Patient> getAllPatients() throws CovidServiceException;

	public List<Object> countPatientByDistrict() throws CovidServiceException;
}
