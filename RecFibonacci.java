class RecFibonacci 
{
	public static void main(String[] args) 
	{
		System.out.println(nFibo(5,0,1));
	}
	public static int nFibo(int n, int n1, int n2)
	{
		if (n==1)
		{
			return n1;
		}
		 return nFibo(n-1,n2,n1+n2);
	}
}
