package technoserve.c2tc.b5.service;

import technoserve.c2tc.b5.dao.StudentDaoImpl;
import technoserve.c2tc.b5.dao.Studentdao;
import technoserve.c2tc.b5.entities.Laptop;
import technoserve.c2tc.b5.entities.Student;

public class StudentServiceImpl implements StudentService {
	Studentdao sd;
	
	public StudentServiceImpl() {
		sd=new StudentDaoImpl();
	}
	

	@Override
	public void addStudent(Student s) {
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
		
	}

	@Override
	public void updateStudent(Student s) {
		sd.startTransaction();
		sd.updateStudent(s);
		sd.endTransaction();
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s=sd.getStudent(uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		sd.startTransaction();
		sd.deleteStudent(uid);
		sd.endTransaction();
		
	}


	@Override
	public void addLaptop(Laptop l1) {
		sd.startTransaction();
		sd.addLaptop(l1);
		sd.endTransaction();
		
	}
	

}
