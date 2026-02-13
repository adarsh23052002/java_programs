import java.util.Scanner;
class CheckZeros 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ennter the number : ");
		int num = sc.nextInt();
		
		while (num>0)
		{ 
			int lastNum= num%10;
			if (lastNum==0)
			{
				System.out.println("There is zero in the number ");
				return;
			}
			num /= 10;
		}
		System.out.println("There is no zero ");
	}
}
