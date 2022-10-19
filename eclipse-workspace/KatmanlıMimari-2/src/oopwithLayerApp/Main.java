package oopwithLayerApp;

import java.util.ArrayList;
import java.util.List;

import oopwithLayerApp.business.CourseManager;
import oopwithLayerApp.core.logging.DataBaseLogger;
import oopwithLayerApp.core.logging.FileLogger;
import oopwithLayerApp.core.logging.Logger;
import oopwithLayerApp.core.logging.MailLogger;
import oopwithLayerApp.dataAcces.HibernateCourseDao;
import oopwithLayerApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		 List<String> nameList=new ArrayList<String>();
		 List<String> catagoryNameList=new ArrayList<String>();
         Course course1=new Course(1, "java kampı-2022","Engin Demiroğ","programlama",70);
         Course course2=new Course(2,"c# kampı-2022" ,"Engin Demiroğ","programlama dili",60);
       
		
		
		
		
		
		 nameList.add(course1.getName());
		 catagoryNameList.add(course1.getCatagoryName());
         CourseManager coursemanager=new CourseManager(course1, nameList,catagoryNameList);
           coursemanager.add(new HibernateCourseDao());
           
         nameList.add(course2.getName());
         catagoryNameList.add(course2.getCatagoryName());
        
         CourseManager coursemanager2=new CourseManager(course2, nameList, catagoryNameList);
         coursemanager2.add(new HibernateCourseDao());
       
      
         Logger[] loggers=new Logger[] {new FileLogger(),new DataBaseLogger(),new MailLogger()};        
         coursemanager.log(loggers,"log mesajı");

	}

}
