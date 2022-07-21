package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.model.EmployeeDTO;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {

	private static Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public Void createEmployee(List<EmployeeDTO> employeeDTOs) {
		logger.info("started creating employees");
		employeeDTOs.forEach(e -> {
			Employee employee = new Employee();
			employee.setName(e.getName());
			employee.setCity(e.getCity());
			employeeRepo.save(employee);
		});
		logger.info("completed creating employees");
		return null;
	}

	public List<EmployeeDTO> getEmployees() {
		logger.info("started getting employees");
		List<Employee> employees = employeeRepo.findAll();
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		employees.forEach(e -> {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setId(e.getId());
			employeeDTO.setName(e.getName());
			employeeDTO.setCity(e.getCity());
			employeeDTOs.add(employeeDTO);
		});
		logger.info("completed getting employees");
		return employeeDTOs;
	}

}
