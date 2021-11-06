package main.creational.abstactfactory.university;

public interface FactoryForUniversityB {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();
}
