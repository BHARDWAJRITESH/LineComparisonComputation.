package com.Bridgelabs;

public class Main {

	public static void main(String[] args) {
		LineComparison lineComparison = new LineComparison ();
        System.out.println ("Welcome To Line Comparison Computation" );
        System.out.println();
      
        System.out.println ( "Enter line 1 coordinates" );
        int line1 = lineComparison.comparison ();
        
        System.out.println ( "Enter line 2 coordinates" );
        int line2 = lineComparison.comparison ();
        
        lineComparison.equalsMethod ( line1,line2 );
        lineComparison.compareToMethod ( line1,line2 );
    }
		
	

}
