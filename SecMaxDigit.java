class SecMaxDigit 
{
	public static void main(String[] args) 
	{
		System.out.println(secMax(18469252));
	}
	public static int secMax(int num)
	{
		int max=0 , secMax=0;
		while (num!=0)
		{
			int last = num%10;
			if (last>max)
			{
				secMax = max;
				max = last;
			}
			else if(last>secMax && last!=max)
			{
				secMax = last;
			}
			num/=10;
		}
		return secMax;
	}
}
