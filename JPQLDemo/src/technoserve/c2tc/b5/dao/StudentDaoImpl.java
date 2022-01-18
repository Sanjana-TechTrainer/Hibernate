package technoserve.c2tc.b5.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import technoserve.c2tc.b5.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	EntityManager em;
	
	

	public StudentDaoImpl() {
		em=Configuration.createEntityManager();
	}



	@Override
	public void addStudent(Student s) {
		em.persist(s);
		
		
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
	public List<Student> getStudentbyTrainerName(String name) {
		String query="Select s from Student s where s.trainer_name like :name";
		TypedQuery<Student> t=em.createQuery(query,Student.class);
		t.setParameter("name", name);
		return t.getResultList();
	}



	@Override
	public Long getTotalCount() {
		String query="Select count(s.uid) from Student s";
		TypedQuery<Long> t=em.createQuery(query,Long.class);
		return t.getSingleResult();
	}



	@Override
	public List<Student> getStudentinRange(Date date1, Date date2) {
		String query="Select s from Student s where s.dob between :low and :high";
		TypedQuery<Student> t=em.createQuery(query,Student.class);
		t.setParameter("low", date1);//low=date1
		t.setParameter("high", date2);
		System.out.println(date1);
		return t.getResultList();
	}



	@Override
	public List<Student> getAllStudents() {
		Query query= em.createNamedQuery("getAllStudents");
		List< Student> list=query.getResultList();
		return list;
	}

}
