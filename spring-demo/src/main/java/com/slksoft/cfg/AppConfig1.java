package com.slksoft.cfg;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.slksoft.dao.DummyUserDao;
import com.slksoft.dao.JdbcUserDao;

@Configuration
public class AppConfig1 {
	
	Logger log= Logger.getLogger("com.slksoft.cfg.AppConfig1");
	
	public AppConfig1(){
		log.info("AppConfig1 instantiated!");
	}

	//This class defines beans. A bean is a POJO with a name
	//We do this by returning a bean from a function annotated with @Bean
	//By default name of the function is considered as name of the bean
	//You may give different name like @Bean(name={"dao","jdbcDao","jdbc"})
	
	@Bean
	@Lazy
	//@Scope("prototype")
	public JdbcUserDao jdbcDao(){
		log.info("AppConfig1.jdbcDao() called!");
		return new JdbcUserDao();
	}
	
	@Bean
	@Lazy
	public DummyUserDao dummyDao(){
		log.info("AppConfig1.dummyDao() called!");
		return new DummyUserDao();
	}
}
