package basicPrograms;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string 1");
String string1=s.next();

System.out.println("enter the striing 2");
String string2=s.next();
if(string1.equals(string2))
{
	System.out.println("equal");
}
else 
{
	System.out.println("not equal");
}

	}

}
