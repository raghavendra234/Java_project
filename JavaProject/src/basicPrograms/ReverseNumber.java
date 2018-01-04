package basicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, reverse = 0;
		 
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	   
	      while( n != 0 )
	      {
	    
	      reverse = reverse * 10;
	      System.out.println("revese"+reverse);
	          reverse = reverse + n%10;
	          System.out.println("revsere:"+reverse);
	          
	          n = n/10;
	          System.out.println("value finally"+n);
		      System.out.println("Reverse of entered number is "+reverse);


	      }
	      System.out.println("Reverse of entered number is "+reverse);
	 
	   }
	}