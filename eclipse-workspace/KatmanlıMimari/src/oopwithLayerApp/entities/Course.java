package oopwithLayerApp.entities;

public class Course {
	private int price;
    private int Courseİd;
    private String name;
    private String instructor;
    private String catagoryName;
	public Course(int courseİd, String name, String instructor, String catagoryName,int price) {
		super();
		Courseİd = courseİd;
		this.name = name;
		this.instructor = instructor;
		this.catagoryName=catagoryName;
		this.price=price;
	}
	public int getCourseİd() {
		return Courseİd;
	}
	public void setCourseİd(int courseİd) {
		Courseİd = courseİd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
  
}
