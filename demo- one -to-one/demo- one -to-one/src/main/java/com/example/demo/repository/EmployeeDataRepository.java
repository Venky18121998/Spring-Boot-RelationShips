package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeData;
@Repository
public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Long> {
	@Query("SELECT pd FROM EmployeeData pd WHERE pd.firstName LIKE %?1%")
	public List<EmployeeData>findByFirstName(String keyword);

}
