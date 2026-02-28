class RangeOfPalindrom 
{
	public static void main(String[] args) 
	{
		int start=100, end=200;
		
		while (start<=end)
		{
			int rev =0, i=start;
			while (i!=0)
			{
				rev = rev*10+(i%10);
				i/=10;
			}
			if (rev==start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
