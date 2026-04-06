class PalindromPrimeMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if (isPalindrom(num) && isPrime(num))
		{
			System.out.println("it is a Palindromic Prime");
		}
		else{
			System.out.println("not Palindromic prime");
		}
		
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while (den<=num/2)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		return (den>num/2);
	}
	public static int reverse(int num)
	{
		int rev=0;
		while (num!=0)
		{
			rev= rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean isPalindrom(int num)
	{
		return reverse(num)==num;
	}
}
