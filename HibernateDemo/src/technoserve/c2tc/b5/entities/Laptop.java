package technoserve.c2tc.b5.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	@JoinColumn(name = "name")
	private String lname;
	@ManyToMany(mappedBy = "laptop")
	private List<Student> student;
	
	
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getLid() {
		return lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
