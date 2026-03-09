class Pyramid 
{
	public static void main(String[] args) 
	{
		int n=10;
		for (int i=0; i<n ;i++ )
		{
			for (int j=0;j<n+i ;j++ )
			{
				if (j<n-1-i)
				{
				   System.out.print(" "+" ");
				}
				else{
					System.out.print("*"+" ");
				}
			}
		/*	for (int sp=0; sp<n-1-i ;sp++ )
			{
			  System.out.print("  ");
			}
			for (int st=0;st<=2*i ;st++ )
			{
				System.out.print("*"+" ");
			}
		*/
		
		System.out.println();
		}
	}
}
