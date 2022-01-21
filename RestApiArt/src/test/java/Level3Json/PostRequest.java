package Level3Json;

import java.util.ArrayList;
import java.util.List;

public class PostRequest {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.setExpertise("Girish Gund");
		s.setInstructor("tutoring");
		s.setServices("Automation");
			
		
		CourseTitle ct1= new CourseTitle();
		ct1.setCourseTitle("Java");
		ct1.setPrice("50");
		
		CourseTitle ct2= new CourseTitle();
		ct2.setCourseTitle("Java");
		ct2.setPrice("50");
		
		CourseTitle ct3= new CourseTitle();
		ct3.setCourseTitle("Java");
		ct3.setPrice("50");
		
		List<Topics> tp = new ArrayList();
	

	}

}
