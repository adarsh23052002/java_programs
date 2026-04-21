class PrimeSquarePattern 
{
	public static void main(String[] args) 
	{
		int n=4, num=2;
		for (int i=0; i<n ;i++ )
		{
			for (int j=0; j<n ; )
			{
				int den=2;
				while (den<num)
				{
					if (num%den==0)
					{
						break;
					}
					den++;
				}
				if (den==num)
				{
					System.out.print(num+" ");
					j++;
				}
				num++;
			}
			System.out.println();
		}
	}
}
