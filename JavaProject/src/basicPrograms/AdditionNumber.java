



package basicPrograms;

public class AdditionNumber {

	public static void main(String[] args) {
int sum=0;
		for(int i=2;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
				
				 sum=sum+i;
			}
			
		}
	System.out.println(sum);
    }


}
