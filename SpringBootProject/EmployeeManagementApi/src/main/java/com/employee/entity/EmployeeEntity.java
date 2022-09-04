package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="emp")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
}
