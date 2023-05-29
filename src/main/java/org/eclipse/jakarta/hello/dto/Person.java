package org.eclipse.jakarta.hello.dto;

public class Person {

	private String name;
	private String lastname;
	private Integer birthYear;
	
	public Person(String name, String lastname, Integer birthYear) {
		this.name = name;
		this.lastname = lastname;
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
}