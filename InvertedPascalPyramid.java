class InvertedPascalPyramid 
{
	public static void main(String[] args) 
	{
		int n=7, sp=0, st=n;
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j=0;j<st ;j++ )
			{
				System.out.print("*"+"   ");
			}
			System.out.println();
			
			if (i<n)
			{ 
				sp++;
				st--;
			}
			else{
				break;
			}
		}
	}
}
