
package technoserve.c2tc.b5.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries(@NamedQuery(name = "getAllStudents" , query = "Select s from Student s"))
public class Student {
	@Id
	private int uid;
	private String name;
	private String trainer_name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	public Student()
	{
		
	}
	public Student(int uid, String name, String trainer_name, Date dob) {
		this.uid = uid;
		this.name = name;
		this.trainer_name = trainer_name;
		this.dob = dob;
	}
	public int getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", trainer_name=" + trainer_name + ", dob=" + dob + "]";
	}
	

}
