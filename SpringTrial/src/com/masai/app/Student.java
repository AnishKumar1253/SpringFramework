package com.masai.app;

import java.util.List;

public class Student 
{
	private int roll; 
	private String name;
	private int marks;
	private List<String> students;
	
	public Student() {}

	public Student(int roll, String name, int marks, List<String> students) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.students = students;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", students=" + students + "]";
	}

	

}
