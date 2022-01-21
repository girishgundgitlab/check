package Level2Json;

import java.util.List;

public class Student {
	
	String firstName;
	String lastName;
	String email;
	String programme;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	
	List<ScoreCard> courses;
	public List<ScoreCard> getCourses() {
		return courses;
	}
	public void setCourses(List<ScoreCard> courses) {
		this.courses = courses;
	}
}
