class RangeOFTechNo 
{
	public static void main(String[] args) 
	{
		int start = 1000, end=10000;
		while (start<=end)
		{
			int cnt=0;
			for (int i=start ; i!=0 ; i/=10 )
			{
				cnt++;
			}
			if (cnt%2==0)
			{
				int pow =1, temp=start;
				for (int i=0 ; i<cnt/2 ; i++ )
				{
					pow *=10;
				}
				int lastHalf=temp%pow;
				int firstHalf= temp/pow;
				
				int total = lastHalf+firstHalf;
				if ((total*total)==start)
				{
					System.out.println(start);
				}
			}
			start++;
			
		}	 
	}
}
