package com.masai.app;

import java.util.List;

public class Cities 
{
	private String name;
	private List<String> cities;
	
	public Cities() {}
	
	public Cities(String name, List<String> cities) {
		super();
		this.name = name;
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	public void citiesInfo() {
		System.out.println(name+":"+ cities);
	}

}
