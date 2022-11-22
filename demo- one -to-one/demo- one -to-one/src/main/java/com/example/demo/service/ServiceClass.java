package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeData;
import com.example.demo.model.EmployeeDataTwo;

public interface ServiceClass {
	public EmployeeData saveData(EmployeeData employeeData);
	public EmployeeDataTwo saveDataTwo(EmployeeDataTwo employeeDataTwo);
	public List<EmployeeData> getData();
	public List<EmployeeDataTwo> getDataTwo();
	public List<EmployeeData>findByFastName(String keyword);

}
