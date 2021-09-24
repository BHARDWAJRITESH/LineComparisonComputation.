package com.Bridgelabs;

import java.util.Scanner;

public class LineComparison {
		public int comparison() {
			
			double a1, a2, b2, b1;
			double Distance;
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a1 point:");
			a1=scan.nextInt();
			
			System.out.println("Enter a2 point:");
			a2=scan.nextInt();
			
			System.out.println("Enter b1 point:");
			b1=scan.nextInt();
			
			System.out.println("Enter b2 point:");
			b2=scan.nextInt();
		
			Distance = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));
			System.out.println(" Distance between" + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + Distance);
		
			return (int) Distance;
		
		}
	
		public void equalsMethod ( double line1, double line2 ) {
        
			if (line1 == line2) {
				System.out.println ( "Both lines are equals" );
			} else {
				System.out.println ( "Lines are not equals" );
			}
		}
	
		public void compareToMethod ( double line1, double line2 ) {
			if (line1 < line2) {
				System.out.println ( "line 2 is greater than line 1" );
			} else if (line1 > line2) {
				System.out.println ( "line 1 is greater than line 2 " );
			} else {
				System.out.println ( "Both lines are equals" );
			}
		}

}
		
		
			