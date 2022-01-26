package main.creational.factory.employee;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee create(String name) {
		return new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
	}
    
}