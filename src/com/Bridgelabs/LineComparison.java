package com.Bridgelabs;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("*****Welcome to the line comparison computation program*****");
		
		double a1, a2, b1, b2, c1, c2, d1, d2;
		double distance1, distance2;
			
		Scanner line = new Scanner (System.in);
		System.out.println("Enter a1 value: ");
		a1 = line.nextInt();
		
		
		System.out.println("Enter a2 value: ");
		a2 = line.nextInt();
		
		
		System.out.println("Enter b1 value: ");
		b1 = line.nextInt();
		
		
		System.out.println("Enter b2 value: ");
		b2 = line.nextInt();
		
		System.out.println("Enter c1 value: ");
		c1 = line.nextInt();
		
		System.out.println("Enter c2 value: ");
		c2 = line.nextInt();
		
		System.out.println("Enter d1 value: ");
		d1 = line.nextInt();
		
		System.out.println("Enter d2 value: ");
		d2 = line.nextInt();
		
		distance1 = Math.sqrt( (a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		distance2 = Math.sqrt( (c2-c1)*(c2-c1) + (d2-d1)*(d2-d1));
		
		System.out.println("Distance between: " +"(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + distance1 );
		System.out.println("Distance between: " +"(" + c1 + "," + d1 + ")," + "(" + c2 + "," + d2 + ")===>" + distance2 );
		System.out.println();
		
		if(distance1 == distance2)
			System.out.println("Both distance1 and distance2 are equal");
		else
			System.out.println("Both distances are not equal");
	}

}
