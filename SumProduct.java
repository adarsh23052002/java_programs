import java.util.Scanner;
class SumProduct                 // sum and product of a number but ignore the zeros. 
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enyer a number : ");
		int num = sc.nextInt();
		
		int sum=0 , pro=1;
		
		while (num!=0)
		{
			int last=num%10;
			if (last != 0)
			{
				sum += last;
				pro *= last;
			}
			num /= 10;
		}
		if (sum==pro)
		{
			System.out.println("Sum and Product are same");
		}
		else{
		System.out.println("Sum and product are not same");
		}
	}
}
