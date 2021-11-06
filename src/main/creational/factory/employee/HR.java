package main.creational.factory.employee;

import java.util.ArrayList;
import java.util.List;

public class HR {

	private List<Employee> employees;

	public HR() {
        employees = new ArrayList<>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public int getNumberOfEmployees() {
		return employees.size();
	}

	public void addNewEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void listEmployees(){
		System.out.println("All Employees");
		employees.forEach(System.out::println);
	}
}
