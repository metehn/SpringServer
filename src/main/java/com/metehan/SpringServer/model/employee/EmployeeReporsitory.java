package com.metehan.SpringServer.model.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeReporsitory extends CrudRepository<Employee, Integer> {
}
