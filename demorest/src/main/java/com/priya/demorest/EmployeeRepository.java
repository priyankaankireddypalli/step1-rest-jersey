package com.priya.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmployeeRepository {
	
	List<Employee> employees;
	
	
	public EmployeeRepository() {
		employees = new ArrayList<>();
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setFirstname("priya");
		e1.setSurname("ankireddy");
		e1.setAge(25);
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setFirstname("raghu");
		e2.setSurname("yadav");
		e2.setAge(23);
		
		employees.add(e1);
		employees.add(e2);
		
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	
	public Employee getEmployee(int eid) {
		
		
		for(Employee emp: employees) {
			if(emp.getEmpid()==eid)
				return emp;
		}
		return new Employee();
		
	}

	public void create(Employee e1) {
		employees.add(e1);
		
	}
	
}
