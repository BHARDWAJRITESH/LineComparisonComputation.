package com.Bridgelabs;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("*****Welcome to the line comparison computation program*****");
		
		double a1, a2, b1, b2;
		double distance;
			
		Scanner line = new Scanner (System.in);
		System.out.println("Enter a1 value: ");
		a1 = line.nextInt();
		
		
		System.out.println("Enter a2 value: ");
		a2 = line.nextInt();
		
		
		System.out.println("Enter b1 value: ");
		b1 = line.nextInt();
		
		
		System.out.println("Enter b2 value: ");
		b2 = line.nextInt();
		
		distance = Math.sqrt( (a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		
		System.out.println("Distance beetween: " +"(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + distance );
		
	}

}
