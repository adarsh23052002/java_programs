class RangeOfStrong 
{
	public static void main(String[] args) 
	{
		int start= 100, end=1000;
		while (start<=end)
		{
			int sum=0, temp=start;
			while (temp!=0)
			{
				int fact=1;
				for (int i=1 ; i<=temp%10 ; i++ )
				{
					fact *= i;
				}
				sum += fact;
				temp/=10;
			}
			if(sum==start)
			{   
				System.out.println(start);
			}
			start++;
		}
		
	}
}
