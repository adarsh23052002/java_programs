class NumberPattern7 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=1 ; i<=n ; i++)
		{ 
			for (int j=1 ;j<=n ;j++ )
			{ 
				int num=1; 
				
				if (j%2!=0)
				{
					num=(j-1)*n+i;
					System.out.print(num+" ");
				}else{
					num=j*n-i+1;
					System.out.print(num+" ");
				}
			}
		   System.out.println();
	
		}
	}
}
