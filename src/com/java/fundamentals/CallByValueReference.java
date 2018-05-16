package com.java.fundamentals;
public class CallByValueReference {
	int var;
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}	
	public static void main(String[] args) {
		int a=2;
		chnage(a);
		System.out.println(a);
		
		CallByValueReference b = new CallByValueReference();
		b.setVar(2);
		change1(b);
		System.out.println(b.getVar());
		
		Integer c=2;
		change2(c);
		System.out.println(c);
	}
	public static void chnage(int i) {
		i=+2;
	}
	public static void change1(CallByValueReference b ) {
		b.setVar(5);
	}
	public static void change2(Integer b ) {
		b=b+2;
	}
}
