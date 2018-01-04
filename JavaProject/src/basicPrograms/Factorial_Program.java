package basicPrograms;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {
	
		int n,fact = 1;
		System.out.println("Enter an integer to calculate it's factorial");
Scanner s=new Scanner(System.in);
		n = s.nextInt();

			for ( int c = 1 ; c <= n ; c++ )
				fact = fact*c;
			
			
			System.out.println("Factorial of "+n+" is = "+fact);
			}
					}

