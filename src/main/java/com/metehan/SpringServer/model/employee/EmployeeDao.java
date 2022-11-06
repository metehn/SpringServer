package com.metehan.SpringServer.model.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDao {

    @Autowired
    EmployeeReporsitory reporsitory;


    public Employee save(Employee employee){

        return reporsitory.save(employee);
    }

    public List<Employee> getAllEmployee(){

        List<Employee> employees = new ArrayList<>();

        Streamable.of(reporsitory.findAll())
                .forEach(employees :: add);

        return employees;
    }

    public void delete(int employeeId){

        reporsitory.deleteById(employeeId);
    }
}
