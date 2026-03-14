class NumberPattern13 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=1 ; i<=n ; i++)
		{ 
			int num=i;
			int ct=n-1;
			for (int j=1 ;j<=i ;j++ )
			{
				System.out.print(num+" ");
				num+=ct;
				ct--;
			}
		   System.out.println();
		}
	}
}
