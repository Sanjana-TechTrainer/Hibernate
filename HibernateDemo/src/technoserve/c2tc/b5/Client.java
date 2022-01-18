package technoserve.c2tc.b5;


import technoserve.c2tc.b5.entities.Laptop;
import technoserve.c2tc.b5.entities.Student;
import technoserve.c2tc.b5.service.StudentService;
import technoserve.c2tc.b5.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
		StudentService ss=new StudentServiceImpl();//upcasting, downcastint
		Student s=new Student();
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();
		l1.setLid(11);
		l1.setLname("Hp");
		l2.setLid(12);
		l2.setLname("Lenevo");
		l3.setLid(13);
		l3.setLname("Acer");
		s.setUid(2100409);
		s.setName("Jyoti");
		s.getLaptop().add(l1);
		s.getLaptop().add(l2);
		s.getLaptop().add(l3);
		ss.addStudent(s);
		}
	

}
