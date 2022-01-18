package technoserve.c2tc.b5.dao;

import technoserve.c2tc.b5.entities.Laptop;
import technoserve.c2tc.b5.entities.Student;

public interface Studentdao {
	public void addStudent(Student s);
	public void updateStudent(Student s);
	public Student getStudent(int uid);
	public void deleteStudent(int uid);
	public void startTransaction();
	public void endTransaction();
	public void addLaptop(Laptop l1);
	

}
