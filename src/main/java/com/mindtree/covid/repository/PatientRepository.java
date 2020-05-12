package com.mindtree.covid.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.covid.entity.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	@Query(value = "select d.district, count(*) pcount from District d inner join Patient p on d.id = p.district_id group by d.district", nativeQuery = true)
	List<Object> countPatientByDistrict();
}
