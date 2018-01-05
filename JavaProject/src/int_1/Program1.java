
/*Question:Write a program for even number and print the even number */


package int_1;

public class Program1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
				 sum=sum+i;
			}
			
		}
	System.out.println(sum);
    	}

}
