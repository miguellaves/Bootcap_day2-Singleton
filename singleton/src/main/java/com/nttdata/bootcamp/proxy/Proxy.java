package com.nttdata.bootcamp.proxy;

import com.nttdata.bootcamp.person.IPersonProxy;
import com.nttdata.bootcamp.person.Person;

public class Proxy implements IPersonProxy {
	
	private Person person;

	public Proxy(Person person) {
		this.person = person;
	}

	@Override
	public void Operation() {
		before();
		this.person.Operation();
		after();
	}

	private void before() {
		System.out.println("Por: " + person.getName());
	}

	private void after() {
		System.out.println("Finalizado por: " + person.getName());
	}

}
