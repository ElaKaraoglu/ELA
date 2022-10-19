package oopwithLayerApp.dataAcces;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Namespace;

import oopwithLayerApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
    Course course;
	@Override
	public void add(Course course) {
		this.course=course;
	      System.out.println("hibernate'e eklendi: "+course.getCourseİd()+","+course.getName()+","+course.getInstructor()+","+course.getCatagoryName()+","+course.getPrice());
		  
		 
	}
	
    void save(String name,String catagoryName)
    {
    	
    }
}
