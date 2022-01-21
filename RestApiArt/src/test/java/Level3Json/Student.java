package Level3Json;

import java.util.List;

import Level2Json.ScoreCard;

public class Student {
	
	String instructor;
	String services;
	String expertise;
		
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	List<ScoreCard> courses;
	public List<ScoreCard> getCourses() {
		return courses;
	}
	public void setCourses(List<ScoreCard> courses) {
		this.courses = courses;
	}
	
	
}
