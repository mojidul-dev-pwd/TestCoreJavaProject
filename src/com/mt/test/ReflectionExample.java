package com.mt.test;

import java.lang.reflect.Method;

class Parent{
	
}

class Person extends Parent{
	public void show() {
		System.out.println("Show Method");
	}
}

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class a = Class.forName("Person");
		//System.out.println("Class Name "+ a.getName());		
		Person p = new Person();
		Class c = p.getClass();
		String className = c.getName();
		System.out.println("Class Name "+ className);
		Method methods[] = c.getMethods();
		for(Method m : methods){
			System.out.println("Method Name "+ m.getName());
		}
		Class parentClass = c.getSuperclass();		
		System.out.println("Super Class Name "+ parentClass.getName());

	}

}
