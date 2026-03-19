class NumnerPattern14 
{
	public static void main(String[] args) 
	{
		int n=10, sp=n/2, di=1;
		for (int i=0;i<n ;i++ )
		{
			int num=1;
			for (int j=0;j<sp ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=0;j<di ;j++ )
			{ 
				System.out.print(num+" ");
				if (j<n/2)
				{
					num++;
				}
				else{
					num--;
				}
			}
			System.out.println();
			if (i<n/2)
			{
				sp--;
				di+=2;
			}
		}
	}
}
