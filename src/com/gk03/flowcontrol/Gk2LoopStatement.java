package com.gk03.flowcontrol;

public class Gk2LoopStatement {

	public static void main(String[] args) {
		
		// While Loop.
		// Need to know, how to write while loop.
		
		String[] str = {"1","2","3"};
		
		for(String each:str ) {
			System.out.println(each);
		}

		// We can't write equivalent for each loop/
		for(int i=0;i<3;i++) {
			System.out.println("The Value of I is: "+i);
		}
	}
}
