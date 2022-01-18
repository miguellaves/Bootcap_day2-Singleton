package com.nttdata.bootcamp.person;

import com.nttdata.bootcamp.prototype.IPrototype;

public class Person implements IPrototype, IPersonDecorator, IPersonProxy {
	
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(PersonBuilder personBuilder) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Person getClone() {
		return new Person(this.name, this.age);
	}

	public static class PersonBuilder {
		
		@SuppressWarnings("unused")
		private String name;
		
		@SuppressWarnings("unused")
		private int age;

		public PersonBuilder name(String name) {
			this.name = name;
			
			return this;
		}

		public PersonBuilder age(int age) {
			this.age = age;
			
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public void Operation() {
		System.out.println("Ejecutando...");
		
	}
	
}
