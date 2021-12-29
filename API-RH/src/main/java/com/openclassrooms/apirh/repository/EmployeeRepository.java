package com.openclassrooms.apirh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.apirh.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
