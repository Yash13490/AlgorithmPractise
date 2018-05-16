package com.java8.fundamentals;

// Dimond problem is possible in java 8 using interface, to deal with it we can use super keyword and call 
// any one interface method, if multiple interfaces (here A & B), which class is implementing has exact same signature...

public class DefaultMethodDimondProblemDefaultLamdaStaticDemo implements A, B {

	public static void main(String[] args) {
		A df = new DefaultMethodDimondProblemDefaultLamdaStaticDemo();
		df.add(5, 3);
		df.a1();
		A.a11(); // call interface static method...
		C c = (temp) -> { // Don't mention interface implementation....
			System.out.println("This method is called through lambda expression, " + temp);
		};
		c.c1(" Uski maka saki naka");
	}
	public void add(int i, int j) {
		A.super.add(i, j); // or to call a's method a.super.add(i,j);
		B.super.add(i, j);
	}
	public void a1() {
		System.out.println(
				"This is functional interface method as we have mentioned implementation of interface we cant use lamda expression");
	}
}

@FunctionalInterface // not mandatory to mention functional interface
interface A {
	public void a1(); // We can define any number of other methods like Default methods, Static
	// methods.

	public static void a11() { // Only one of abstract, default, or static permitted in interface
		System.out.println("This is non abstract static method  for A");
	}

	default void add(int i, int j) {
		System.out.println("O/p::" + (i + j));
	}
}

interface B {
	default void add(int i, int j) {
		System.out.println("O/p::" + (i - j));
	}
}

interface C {
	public void c1(String temp); // only one abstract method....

	public abstract String toString(); // If we override java.lang.Object class’s method as an abstract method, which
	// does not count as an abstract method.
}