package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Laptop;
import technoserve.c2tc.b5.entities.Student;

public class StudentDaoImpl implements Studentdao{
	EntityManager em;
	
	public StudentDaoImpl() {
		em=Configuration.getEntityManager();
	}

	@Override
	public void addStudent(Student s) {
		em.persist(s);
		
	}

	@Override
	public void updateStudent(Student s) {
		em.merge(s);
		
	}

	@Override
	public Student getStudent(int uid) {
		Student s=em.find(Student.class, uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		Student s=getStudent(uid);
		em.remove(s);
		
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void addLaptop(Laptop l1) {
		em.persist(l1);
		
	}

}
