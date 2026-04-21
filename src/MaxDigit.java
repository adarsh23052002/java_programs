class MaxDigit 
{
	public static void main(String[] args) 
	{
		int num=66894261, max=0;
		while (num!=0)
		{
		   if (num%10>max)
		   {
			   max=num%10;
		   }
		   num/=10;
		}
		System.out.println(max);
	}
}
