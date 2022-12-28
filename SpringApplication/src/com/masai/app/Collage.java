package com.masai.app;

public class Collage
{
	private String collage_name;
	private Student stud;
	private String collage_address;
	
	public Collage() {}
	
	public String getCollage_name() {
		return collage_name;
	}
	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}
	public Student getStudent() {
		return stud;
	}
	public void setStudent(Student student) {
		this.stud = student;
	}
	public String getCollage_address() {
		return collage_address;
	}
	public void setCollage_address(String collage_address) {
		this.collage_address = collage_address;
	}
	
	
	
	@Override
	public String toString() {
		return "Collage [collage_name=" + collage_name + ", student=" + stud + ", collage_address=" + collage_address
				+ "]";
	}
	
	public void setUp()
	{
		System.out.println("Some impt. operation to be performed after property set");
	}
	
	public void destroy()
	{
		System.out.println("Any operation to be performed just before destrucion");
	}
	
	public void showDetails()
	{
		System.out.println("Collage name is:" +collage_name);
		System.out.println("Collage Address is:" +collage_address);
		System.out.println("Collage Student is:" +stud);
	}

}
