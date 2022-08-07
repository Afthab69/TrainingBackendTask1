package com.training1;
import java.util.Scanner;

public class task1 {
	public static void main(String args[]) {
		Scanner readme = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a,b;
		int s=0;
		a = readme.nextInt();
		System.out.println("Enter second number:");
		b = readme.nextInt();
		char c;
		System.out.println("Enter operator:");
		c = readme.next().charAt(0);
		if(c=='+') {
			s = a+b;
		}
		else if(c=='-') {
			s = a-b;
		}
		else if(c=='*') {
			s = a*b;
		}
		else if(c=='/') {
			if(b==0) {
				System.out.println("Invalid operation");
				System.exit(0);
			}
			s = a/b;
		}
		System.out.println("Result: "+s);
	}
}
