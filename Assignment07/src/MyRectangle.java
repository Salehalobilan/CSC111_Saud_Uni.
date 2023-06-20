//441102323 Saleh Alobaylan
import java.util.Locale; import java.util.Scanner;


public class MyRectangle {

	 public double width ;
	 public double height ;
	 public double area ;
	 public double perimeter = area - height ;
	 
	 public void printRectangle() {
		 
	     for (int i=0 ; i < (int)height ; i++) {
	    	 
	         for (int k = 0 ; k < (int)width ; k++ ) {
	        	 
	 
	             System.out.print("*");}
	           
	         System.out.println();}
	 }
	 	
}


