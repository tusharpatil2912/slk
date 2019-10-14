package com.slksoft.programs;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slksoft.cfg.AppConfig1;
import com.slksoft.dao.UserDao;

public class Main1 {

	static Logger log = Logger.getLogger("Main1");
	
	public static void main(String[] args) {

		// A spring container is represented by a variable of type (Interface)
		//org.springframework.context.ApplicationContext.
		//some of the most used implementations are
		//FileSystemXmlApplicationContext,
		//classPathXmlApplicationContext, AnnotationConfigApplicationContext
		
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
		
		log.info("---------------- Spring Container ready! --------------");
		
		UserDao dao= ctx.getBean("jdbcDao", UserDao.class);
		int c = dao.count();
		log.info(String.format("There are %d users", c));
		
		ctx.close();
		
	}

}
