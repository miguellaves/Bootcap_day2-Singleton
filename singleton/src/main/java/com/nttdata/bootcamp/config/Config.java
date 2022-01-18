package com.nttdata.bootcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.bootcamp.person.Person;

@Configuration
public class Config {

	 @Bean(name = "personPrototype")
	 @Scope("prototype")
	 public Person personPrototype() {
		 return new Person();
	 }
	 
	 @Bean(name = "personSingleton")
	 @Scope("singleton")
	 public Person personSingleton() {
		 return new Person();
	 }
}
