package oopwithLayerApp.dataAcces;

import oopwithLayerApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
	      System.out.println("JDBC'e eklendi");
		
	}
}
