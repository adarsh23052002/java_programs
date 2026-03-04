class RangeOfDisarium 
{
	public static void main(String[] args) 
	{
		int start=10, end=1000;
		while (start<=end)
		{
			int cnt=0, sum=0;
			for (int i=start;i!=0 ;i/=10 )
			{
				cnt++;
			}
			for (int j=start ;j!=0 ;j/=10 )
			{
				int last=j%10;
				int pow =1;
				for (int k=0;k<cnt ;k++ )
				{
					pow *=last;
				}
				sum +=pow;
				cnt--;
			}
			if (sum==start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
