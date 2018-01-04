package basicPrograms;

class Access
{

	
	public void A()
	{
		int a=10;
		System.out.println(a);

	}
	private void AV()
	{
		int b=10;
	}
	protected void AVD()
	{
		int b=100;
		System.out.println(b);
	}
	void ABCD(int a)
	{
		int b=100;
		System.out.println(a);
	}
}



public class AccessModifier  {

	
	
	
	
	public static void main(String[] args) {

Access ac=new Access();
ac.A();
/*ac.AV();*/
ac.AVD();
ac.ABCD(20);



	}

}
