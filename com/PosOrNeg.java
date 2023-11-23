//write a program to find a number is Positive or Negative or Zero
package com;
//class created
public class PosOrNeg {
	//main method
	public static void main(String[] args) {
		//declaration and initialization
		int a = 7;
		//performing operations and printing data using if-else-if
		if(a > 0) {
			System.out.println(a+ " is Positive number.");
		} else if(a < 0) {
			System.out.println(a+ " is Negetive number.");	
		}
		else {
			System.out.println(a+" is Zero.");
		}
	}

}
