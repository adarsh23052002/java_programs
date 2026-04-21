class  MinDigit
{
	public static void main(String[] args) 
	{
		int num=51894269, min=9;
		while (num!=0)
		{
			if (num%10<min)
			{
				min=num%10;
			}
			num/=10;
		}
		System.out.println(min);
	}
}
