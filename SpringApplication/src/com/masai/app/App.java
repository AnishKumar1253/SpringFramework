package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collage col=ctx.getBean(Collage.class,"col");
		col.showDetails();
		
		Cities cty=ctx.getBean(Cities.class,"cit");
		cty.citiesInfo();
		
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
	}

}
