/**
 * 
 */
package com.qualifiers.di.qualifiers;

import org.springframework.stereotype.Component;

/**
 * @author circumbaley
 *
 */
@Component
public abstract class Animal {
	private String name;
	private Integer age;
	
	

	public Animal(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	

}
