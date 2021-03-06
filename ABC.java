package com.cg.test;

public class ABC implements A, B {

	@Override
	public void test(String a4) {
		System.out.println("From Amit: " + a4);
	}
	
	public void someMethod() throws NullPointerException{
		try{
			throw new NullPointerException();
		} finally{
			
		}
	}
	
	public void callException(){
		try{
			someMethod();
		} catch(Throwable e){
			
		}
	}

	public static void main(String[] args){
		A a = new ABC();
		B b = new ABC();
		a.test("a");
		b.test("b");
	}
}