package com.makotojava.intro;

import java.util.logging.Logger;

public class Person {
	
	Logger l = Logger.getLogger(Person.class.getName());
	
	//private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	/*public Person() {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.gender = gender;
		} */
	//UNIT 4 QUIZ Q5.
	//Getters and Setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//UNIT SIX QUIZ Q4
	public String toString() {
	String ret = "Full Name: " + getFirstName() + ", " +
		"Height: " + getHeight() + " , " +
		"Weight: " + getWeight() + " , " +
		"Eye Color: " + getEyeColor() + " , " +
		"Gender: " + getGender();
		
		return ret;
	}
	public void printAudit(StringBuilder buffer) {
		buffer.append("firstName=");
		buffer.append(getFirstName());
		buffer.append(",");
		buffer.append("lastName=");
		buffer.append(getFirstName());
		buffer.append(",");
		buffer.append("Age=");
		buffer.append(getAge());
		buffer.append(",");
		buffer.append("Height=");
		buffer.append(getHeight());
		buffer.append(",");
		buffer.append("Weight=");
		buffer.append(getWeight());
		buffer.append(",");
		buffer.append("EyeColor=");
		buffer.append(getEyeColor());
		buffer.append(",");
		buffer.append("Gender=");
		buffer.append(getGender());
		}
		public void printAudit(Logger l) {
		StringBuilder sb = new StringBuilder();
		printAudit(sb);
		l.info(sb.toString());
		}
}
