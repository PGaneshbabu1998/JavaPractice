//write a program using java to find swapping two variables without using third variable
package com;
//class creating
public class SwapWithoutUsingThird {
	//main method
	public static void main(String[] args) {
		//declaration and initialization of two values 
		int a = 3 , b = 7;
		//printing values before swapping
		System.out.println("a="+a+" and b="+b+" before swapping.");
		//performing calculation
		a = a+b;
		b = a-b;
		a = a-b;
		//printing values after swapping
		System.out.println("a="+a+" and b="+b+" after swapping.");
	}

}
