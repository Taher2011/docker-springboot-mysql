package com.employee.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name = "employee")
@Data
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String city;

	private String name;

}