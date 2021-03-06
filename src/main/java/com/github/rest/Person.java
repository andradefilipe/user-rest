package com.github.rest;

class Person {

	private String firstName;
	private String surname;
	private int dobYear;

	public Person() {
	}

	public Person(String fn, String s, int year) {
		firstName = fn;
		surname = s;
		dobYear = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDobYear() {
		return dobYear;
	}

	public void setDobYear(int dobYear) {
		this.dobYear = dobYear;
	}

}
