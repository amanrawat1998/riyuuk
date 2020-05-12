package com.mindtree.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.covid.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

}
