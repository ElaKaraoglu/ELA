package oopwithLayerApp.business;

import java.util.Iterator;
import java.util.List;

import org.w3c.dom.NameList;

import oopwithLayerApp.core.logging.Logger;
import oopwithLayerApp.core.logging.MailLogger;
import oopwithLayerApp.dataAcces.CourseDao;
import oopwithLayerApp.dataAcces.HibernateCourseDao;
import oopwithLayerApp.entities.Course;
import oopwithLayerApp.core.logging.Logger;
import oopwithLayerApp.dataAcces.CourseDao;

public class CourseManager {
	
	 Course course=null;
	 
	 public CourseManager(Course course, List<String> namelist,List<String> catagoryNamelist) throws Exception {
		 this.course=course;
		 if(course.getPrice()<0)
		 {
			throw new Exception("kurs fiyatı 0 dan küçük olamaz");
		 }
		 
		 for(int i=0;i<namelist.size()-1;i++) {
			 
			 if(catagoryNamelist.get(i)==course.getCatagoryName()&&catagoryNamelist.size()>1) {
				 throw new Exception("kategori adı tekrarlanamaz");
			 }
			 if(namelist.get(i)==course.getName()&&namelist.size()>1) {
				 throw new Exception("kurs adı tekrarlanamaz");
			
			 }
				 
		 }

		
	 }
	 
		  
    

	public void add(CourseDao coursedao) {
		
    	 coursedao.add(course);
     }
     
     public void log(Logger[] loggers,String message) {
    	 for(Logger logger:loggers) {
    		 logger.log(message);
    	 }
     }
   
}
