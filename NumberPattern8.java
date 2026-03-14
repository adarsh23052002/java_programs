class NumberPattern8 
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch='a';
		for (int i=0 ; i<5 ; i++)
		{
			for (int j=0 ;j<3 ;j++ )
			{
				System.out.print(ch+""+num+"  ");
				ch++;
				num++;
			}
		   System.out.println();			
		}
	}
}
