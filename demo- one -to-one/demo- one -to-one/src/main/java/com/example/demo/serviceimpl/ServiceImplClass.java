package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeData;
import com.example.demo.model.EmployeeDataTwo;
import com.example.demo.repository.EmployeeDataRepository;
import com.example.demo.repository.EmployeeDataTwoRepository;
import com.example.demo.service.ServiceClass;


@Service
public class ServiceImplClass implements ServiceClass{
	@Autowired
	EmployeeDataRepository employeeDataRepository;
	@Autowired
	EmployeeDataTwoRepository employeeDataTwoRepository;
    @Override
	public EmployeeData saveData(EmployeeData employeeData) {
	EmployeeData EmpData = employeeDataRepository.save(employeeData);
		return EmpData;
	}
    @Override
	public EmployeeDataTwo saveDataTwo(EmployeeDataTwo employeeDataTwo) {
	EmployeeDataTwo data = employeeDataTwoRepository.save(employeeDataTwo);
		return data;
	}
	@Override
	public List<EmployeeData> getData() {
		List<EmployeeData>empdata=new ArrayList<EmployeeData>();
		employeeDataRepository.findAll().forEach(empdata::add);
		return empdata;
	}
	@Override
	public List<EmployeeDataTwo> getDataTwo() {
	
         List<EmployeeDataTwo> emp = employeeDataTwoRepository.findAll();
		return emp;
	}
	@Override
	public List<EmployeeData> findByFastName(String keyword) {
		return	employeeDataRepository.findByFirstName(keyword);
		
	}
	
	

}
