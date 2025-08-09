package com.tnsif.nonaccessmodifiers;

final class FinalDemo {  
	
	final int Var = 100;  
	
	final void display() {  // Final method cannot be overridden
		System.out.println("Show the value of Var: " + Var);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();

	}
}
