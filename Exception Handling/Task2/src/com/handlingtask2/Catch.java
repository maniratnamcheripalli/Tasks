package com.tash2;

public class Catch {

	public static void main(String[] args) {
		   try {
			   int b=10/0;
		   }
              catch(ArithmeticException e)  
                 {  
                  System.out.println("Arithmetic Exception occurs");  
                 }  
		   
              catch(ArrayIndexOutOfBoundsException e)  
                 {  
                  System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                 }    
              catch(Exception e)  
                 {  
                  System.out.println("Parent Exception occurs");  
                 }          


	}

}
