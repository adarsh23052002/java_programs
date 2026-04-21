class StatBlock2 
{
	static int num = 145;
	static 
	{ 
		int temp=num;
		int sum=0;
		while (temp!=0)
		{
			int last =temp%10;
		    int fact=1;
		   for (int i=1;i<=last;i++ )
		   {
			 fact *= i;
		   }
		   sum += fact;
		   temp/=10;
		}
		if (sum==num)
		{
			System.out.println("Its a strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
}
