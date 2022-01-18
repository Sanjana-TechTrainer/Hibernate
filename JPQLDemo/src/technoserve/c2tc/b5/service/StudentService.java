package technoserve.c2tc.b5.service;

import java.util.Date;
import java.util.List;

import technoserve.c2tc.b5.entities.Student;

public interface StudentService {
	public void addStudent(Student s);

	public List<Student> getStudentbyTrainerName(String name);

	public Long getTotalCount();

	public List<Student> getStudentinRange(Date date1, Date date2);

	public List<Student> getAllStudents();

}
