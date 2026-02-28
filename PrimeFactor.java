import java.util.Scanner;
class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int start = 2;
		
		while (start<=num)
		{
			int den=2;
			while (den<start)
			{
				if (start%den==0)
				{
					break;
				}
				den++;
			}
			if (den==start && num%start==0)
			{
				int times= num/start;
				System.out.println(start+" divides "+num+" for "+times);
			}
			start++;
		}	
	}
}
