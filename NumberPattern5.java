class NumberPattern5 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='a';
		int num=1;
		
		for (int i=0 ; i<n ; i++)
		{
			for (int j=0 ;j<n ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch+"  ");
				    ch++;
				}
				else{
				    System.out.print(num+"  ");
				    num++;
				 }	
			}
		   System.out.println();			
		}
	}
}
			