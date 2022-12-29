package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		
		Collage coll=ctx.getBean(Collage.class,"col");
		coll.showDetails();
		
		Cities cty=ctx.getBean(Cities.class,"cit");
		cty.citiesInfo();
			
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
	}

}
