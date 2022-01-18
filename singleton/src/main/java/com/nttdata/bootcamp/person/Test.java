package com.nttdata.bootcamp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nttdata.bootcamp.proxy.Proxy;

@SpringBootApplication
public class Test implements CommandLineRunner {

	@Autowired
	public ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//setteo de nombre y edad
		PersonSingleton.getInstance().setName("miguel");
		PersonSingleton.getInstance().setAge(99);

		//setteo de nuevo nombre para nueva variable
		Person person1 = new Person();
		person1.setName("angel");
		Person person2 = person1.getClone();

		System.out.println(person1.getName());
		System.out.println(person2.getName());
		
		PersonDecorator person3 = new PersonDecorator(person2);
		System.out.println(person3.getName());
		
		System.out.println("==================");
		
		//llamada al metodo operation para envio de nombre
		Proxy person4 = new Proxy(person1);
		person4.Operation();
		
		System.out.println("==================");
		
		Unit soldier = new Unit("soldado");
		Unit sergeant = new Unit("sargento", soldier);
		Unit captain = new Unit("capitan", sergeant);
		captain.executeCommand("Accion");
		
	}

}