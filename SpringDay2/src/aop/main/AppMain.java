  
package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.FactoryService;
import aop.service.ShapeService;

public class AppMain {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		
		FactoryService context = new FactoryService();
		ShapeService shapeService = (ShapeService) context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		//System.out.print(shapeService.getCircle().setName("isoceless"));
		//System.out.println(shapeService.getCircle().getDia());
		//shapeService.getCircle().setName("incircle");


	}



}