package com.nttdata.bootcamp.person;

public class PersonDecorator implements IPersonDecorator {
	
	private Person person;
	
	public PersonDecorator(Person person) {
		this.person = person;
	}
	
	public String getName() {
		return "Nombre: " + this.person.getName();
	}

	public int getAge() {
		return this.person.getAge()*100;
	}
	
}
