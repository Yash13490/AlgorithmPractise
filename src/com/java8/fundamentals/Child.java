package com.java8.fundamentals;

abstract class AbstractClass {
	
	public AbstractClass() {
		System.out.println("This is parent constructor");
	}
	{
		System.out.println("Instance initializer block");
	}
	static {
		System.out.println("Parent static block");
	}
	public abstract int abstractMethod(int i, int j); // abstract keyword mandatory

	public void actualMethod(String name) {
		System.out.println("actual method::" + name);
	}
}

public class Child extends AbstractClass {
	
	public Child()
	{
		System.out.println("This child constructor");
	}
	{
		System.out.println("Child Instance initializer block");
	}
	static {
		System.out.println("Child static block");
	}
	
	@Override
	public int abstractMethod(int i, int j) {
		System.out.println("child class overriden method::" + (i+j));
		return i + j;
	}
	public static void main(String args[]) {
		
		Child child = new Child();
		child.abstractMethod(4, 3);
		child.actualMethod("Yash");
		AbstractClass c = new AbstractClass() {

			@Override
			public int abstractMethod(int i, int j) {
				return i - j;
			}
		};
		System.out.println("annonymous class method::" + c.abstractMethod(3, 4));
	}
}