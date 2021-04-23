package com.nagarro.Employee.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.Employee.Management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

