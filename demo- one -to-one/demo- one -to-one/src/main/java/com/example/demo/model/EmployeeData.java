package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name="firstone")
public class EmployeeData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="add_id")
	private Long addid;
	private String firstName;
	private String lastName;
	private String fathername;
	private String motherName;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="fk_emp_id")
	private EmployeeDataTwo employeeDataTwo;
	


}
