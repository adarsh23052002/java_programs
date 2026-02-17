import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();
		
		int product = 1;
		
		for (int i = 0 ;num>i ;num/=10)
		{
			int last = num%10;
			product = last*product;
		}
		
		
		/*  // OR
		
		while (num>0)
		{
			int last = num%10;
			product = last*product;
			num /=10;
		}
		*/
		
		
		System.out.println("Product of digits is : "+product);
	}
}