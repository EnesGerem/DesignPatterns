package main.creational.factory.employee;

public interface DirectorFactory{

    public Director create(String name, String workingDepartment, int bonus);

}
