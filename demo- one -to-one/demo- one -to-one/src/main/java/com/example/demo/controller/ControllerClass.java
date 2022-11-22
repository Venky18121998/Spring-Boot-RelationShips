package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeData;
import com.example.demo.model.EmployeeDataTwo;
import com.example.demo.service.ServiceClass;
import com.example.demo.serviceimpl.ServiceImplClass;

@RestController
public class ControllerClass {
	@Autowired
	ServiceImplClass serviceImplClass;
	@Autowired
	ServiceClass serviceClass;

	@PostMapping("/save")
	public EmployeeData createEmployee(@RequestBody EmployeeData employeeData) {
		EmployeeData data = serviceClass.saveData(employeeData);
		return data;

	}

	@PostMapping("/savetwo")
	public EmployeeDataTwo createEmp(@RequestBody EmployeeDataTwo employeeDataTwo) {
		EmployeeDataTwo data = serviceClass.saveDataTwo(employeeDataTwo);
		return data;

	}

	@GetMapping("/getvalue")
	public List<EmployeeData> findEmployee() {
		return serviceClass.getData();

	}

	@GetMapping("/getone")
	public List<EmployeeDataTwo> findEmp() {
		return serviceClass.getDataTwo();

	}
	@GetMapping("/gettwo/{keyword}")
	public List<EmployeeData> findTwo(@PathVariable String keyword){
		return serviceClass.findByFastName(keyword);
	}

}
