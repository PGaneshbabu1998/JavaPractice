//write a program using java to find swapping with using third variable
package com;
//class creating 
public class SwapWithUsingThird {
	//main method
	public static void main(String[] args) {
		//declaration and initialization 
		int a =3 , b = 7,c;
		//printing values before swapping
		System.out.println("a="+a+" and b="+b+" before swapping.");
		//performing calculation
		c = a;
		a = b;
		b = c;
		//printing values after swapping
		System.out.println("a="+a+" and b="+b+" after swapping.");
	}
	
}
