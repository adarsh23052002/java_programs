class Butterfly 
{
	public static void main(String[] args) 
	{
		int n=5	, st=1, sp=n/2; 
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<st ;j++ )
			{
				System.out.print("*"+" ");
			}
			for (int j=0;j<=sp ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j=0;j<(i==n/2?st-1:st) ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			if (i<n/2)
		   {
			st++;
			sp-=2;
		   }
		   else
		   {
			st--;
			sp+=2;
		   }
		}
		
		
	}
}
