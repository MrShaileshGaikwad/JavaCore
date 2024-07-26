package com.guvi;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5;
	        int b = 10;

	        // Perform the operations and print the results
	        System.out.println("a + b = " + (a + b)); //15
	        System.out.println("a - b = " + (a - b));//-5
	        System.out.println("a * b = " + (a * b));//50
	        System.out.println("b / a = " + (b / a));//2
	        System.out.println("b % a = " + (b % a));//0
	        System.out.println("b++ = " + (b++)); //10
	        System.out.println("b (after increment) = " + b);  //11
	        System.out.println("a & b = " + (a & b));   //1
	        System.out.println("a | b = " + (a | b));//15
	        System.out.println("a ^ b = " + (a ^ b));//14
	        System.out.println("-a = " + (-a));//-5
	        System.out.println("a << 2 = " + (a << 2));//20
	        System.out.println("b >> 2 = " + (b >> 2));//2
	        System.out.println("a >>> 2 = " + (a >>> 2));//1
	        System.out.println("a && b = " + (a != 0 && b != 0));//true
	        System.out.println("a  b = " + (a != b &&  b != 0));
	        System.out.println("!(a && b) = " + !(a != 0 && b != 0));//false
	}

}
