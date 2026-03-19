class FibonacciMethod 
{
	public static void main(String[] args) 
	{
		fibonacci(2);
	}
	public static void fibonacci(int num)
	{
		int n1=0 , n2=1, ans;
		while (num!=0)
		{
			ans=n1+n2;
			if (n1==num)
			{
				System.out.println("its a fibonacci number");
				break;
			}
			else if (n1>num)
			{
				System.out.println("not a fibonacci number");
				break;
			}
			else{
				n1=n2;
				n2=ans;
			}
		}
	}
}
