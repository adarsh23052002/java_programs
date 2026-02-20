import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int den = 2 , rev = 0 , temp = num, den1 =den;
	    
		while (den < num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (den!=num)
		{
			System.out.println("It's not a twisted prime");
		} 
		
		else
		{
		   while (temp>0)
		  {
			int last = temp%10;
			rev = rev*10+last;
			temp /=10;
		  }
		
		   while (den1<rev)
		   {
			if (rev%den1==0)
			{
				break;
			}
			den1++;
		   }
		
		   if ( den1==rev)
		   {
			 System.out.println("it is a twisted prime ");
		   }
		   else{
			System.out.println("not a twisted prime");
		      }  
		} 
	}
}
