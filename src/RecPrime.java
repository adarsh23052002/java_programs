class RecPrime 
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(131,2));
	}
	public static boolean isPrime(int num,int den)
	{
		 if (den<num)
		{
			if (num%den==0)
			{
			  return false;
			}
			 else{
				 return isPrime(num,den+1);
			 }
		}
		else{
			return true;
		}
	}
}
