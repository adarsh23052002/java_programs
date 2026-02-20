import java.util.Scanner;
class FactorCount 
{
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int den = 1;
		int count = 0;
		
		while (den<=num/2)
		{
			if (num%den==0)
			{
				count++;
			}
			den++;
		}
			System.out.print("Total no. of factor are : "+(count+1)); 
	}
}
/* since we take num/2 in the while condition that's why 
   the number it self will not be counted by the compiler.
   So in the final print we give count+1.
*/   