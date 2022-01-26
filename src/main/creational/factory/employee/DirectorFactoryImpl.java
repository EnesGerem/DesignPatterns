package main.creational.factory.employee;

public class DirectorFactoryImpl implements DirectorFactory{

	@Override
	public Director create(String name, String workingDepartment, int bonus) {
		return new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment, bonus);
	}
}
