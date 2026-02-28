class ReverseOfRange 
{
	public static void main(String[] args) 
	{
		int start=200, end=100;
		
		while (start>=end)
		{
			int rev=0;
			for (int i=start ; i>0 ;i/=10 )
			{
				rev= rev*10+(i%10);
			}
			System.out.println(rev);
			start--;
		}
		
	}
}
