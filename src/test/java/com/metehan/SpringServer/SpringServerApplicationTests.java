package com.metehan.SpringServer;

import com.metehan.SpringServer.model.employee.Employee;
import com.metehan.SpringServer.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setBranch("IT");
		employee.setLocation("Turkiye");
		employee.setName("Ersoy");

		employeeDao.save(employee);
	}


	void getAllEmployees(){
		List<Employee> employees = employeeDao.getAllEmployee();
		for (Employee employee: employees) {
			System.out.println(employee.toString());
		}
	}


	void getAllEmployeesAndDeleteThem(){
		List<Employee> employees = employeeDao.getAllEmployee();
		for (Employee employee: employees) {
			employeeDao.delete(employee.getId());
		}
	}

}
