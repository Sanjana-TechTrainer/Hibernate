package technoserve.c2tc.b5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import technoserve.c2tc.b5.entities.Student;
import technoserve.c2tc.b5.service.StudentService;
import technoserve.c2tc.b5.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) throws ParseException {
		String str1="01-01-1999";
		String str2="31-12-2000";
		SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(str1);
		Date date2=format.parse(str2);
		//Student s= new Student(2100407,"Srushti Meshram","Sanjana",date);
		StudentService ss=new StudentServiceImpl();
		System.out.println(ss.getAllStudents());
	}

}
