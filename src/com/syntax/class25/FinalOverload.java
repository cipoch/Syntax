package com.syntax.class25;

public class FinalOverload {

	
	public final static void doSomething(String o) {
        System.out.println("String");
    }

	
	
	
	
	public static void main(String[] args) {
		
		doSomething("dd");
		
		
	    Base b = new Base();
	    Base d = new Derived();
	    b.doSomething(3);
	    d.doSomething(5);
	}
	
	
}


class Base {
	public final void doSomething(int o) {
        System.out.println("int");
    }
}

class Derived extends Base {
    public void doSomething(double i) {
        System.out.println("double");
    }
}