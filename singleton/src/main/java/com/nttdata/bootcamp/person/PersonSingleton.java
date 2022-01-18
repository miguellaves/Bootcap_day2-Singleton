package com.nttdata.bootcamp.person;

public class PersonSingleton {
	
	private static Person INSTANCE;

	public static Person getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}
	
	public enum PersonSingletonEnum {		
		INSTANCE;
		Person person;
		
		private PersonSingletonEnum() {
			this.person = new Person();
		}
		
		public Person getPerson() {
			return this.person;
		}
		
	}
}
