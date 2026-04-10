class StatBlock1 
{
	static int num=153;
	static int ct;
	static
	{
		for (int i=num;i!=0 ;i/=10 )
		{
			ct++;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(num));
	}
	public static boolean isArmstrong(int num)
	{
		int temp=num;
		int sum=0;
		while (num!=0)
		{
		   int last = num%10;
		   int pow =1;
		   for (int i=0;i<ct ;i++ )
		   {
			  pow*=last;
		   }
		   sum=sum+pow;
		 num/=10;
		}
		if (sum==temp)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
