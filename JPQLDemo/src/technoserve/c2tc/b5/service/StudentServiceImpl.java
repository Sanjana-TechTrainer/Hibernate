package technoserve.c2tc.b5.service;

import java.util.Date;
import java.util.List;

import technoserve.c2tc.b5.dao.StudentDao;
import technoserve.c2tc.b5.dao.StudentDaoImpl;
import technoserve.c2tc.b5.entities.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDao sd;

	public StudentServiceImpl() {
		sd=new StudentDaoImpl();//upcasting
	}

	@Override
	public void addStudent(Student s) {
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
	}

	@Override
	public List<Student> getStudentbyTrainerName(String name) {
		return sd. getStudentbyTrainerName(name);
	}

	@Override
	public Long getTotalCount() {
		return sd.getTotalCount();
	}

	@Override
	public List<Student> getStudentinRange(Date date1, Date date2) {
		return sd.getStudentinRange(date1, date2);
	}

	@Override
	public List<Student> getAllStudents() {
		return sd.getAllStudents();
	}

}
