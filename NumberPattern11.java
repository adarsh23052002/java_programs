class NumberPattern11 
{
	public static void main(String[] args) 
	{
		int n=10, digit=1, sp=n/2;
		for (int i=0 ; i<n/2 ; i++)
		{
			int num=1;
			
			for (int j=0 ;j<sp ;j++ )
			{
				System.out.print(" "+"  ");
			}
			for (int j=0 ;j<digit ;j++ )
			{
				System.out.print(num+"  ");
				num++;
			}
		   System.out.println();
		   sp--;
		   digit+=2;
		}
	}
}
