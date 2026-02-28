class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		int start=10 , end=1000;
		
		while (start<=end)
		{
			int count=0;
			for (int i=start ; i!=0 ; i/=10 )
			{
				count++;
			}
			int temp=start, sum=0;
			while (temp!=0)
			{
				int pow=1;
				for (int i=0 ; i<count ;i++ )
				{
					pow *= temp%10;
				}
				sum += pow;
				temp /= 10;
			}
			if (sum==start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
