class RangeOfXylem 
{
	public static void main(String[] args) 
	{
	   int start = 1000, end=2000;
	   
	   while (start<=end)
	   {
		   int temp= start;
		   int sumEnd = temp%10;
		    temp/=10;
			
			int sumMid=0;
		   while (temp>9)
		   {
			   sumMid =sumMid+ temp%10;
			   temp/=10;
		   }
		    sumEnd = sumEnd+ temp;
		   
		   if (sumEnd==sumMid)
		   {
			   System.out.println(start);
		   }
		   start++;
	   }
	}
}
