class PrimeMethod 
{
	public static void main(String[] args) 
	{
		prime(13);
	}
	
	public static void prime(int num)
	{
		if (num<=1)
		{
			System.out.println("not a prime number");
		}
		else{
			int den=2;
			
			while (den<=num/2)
			{
				if (num%den==0)
				{
					break;
				}
				den++;
			}
			if (den>num/2)
			{
				System.out.println("its a prime number");
			}
			else {
				System.out.println("not a prime");
			}
		}
	}
}
