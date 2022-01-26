package main.creational.factory.employee;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public Manager create(String name, String workingDepartment) {
		return new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment);
	}

}
