class NumberPattern6 
{
	public static void main(String[] args) 
	{
		int n=4, num=1;
		for (int i=0 ; i<n ; i++)
		{
			int temp=num;
			
			for (int j=0 ;j<n ;j++ )
			{
			  System.out.print(temp+" ");
			  temp+=4;	
			}
		   System.out.println();
		   num++;
		}
	}
}
