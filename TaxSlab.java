import java.util.Scanner;
class TaxSlab
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your annual income : ");
		double income = sc.nextDouble();
		
		if (income <= 400000.0)
		{
			System.out.println("0% tax on your income");
		}
		else if (income <= 800000.0)
		{
			System.out.println("5% tax on your income");
		}
		else if (income <= 1200000.0)
		{
			System.out.println("10% tax on your income");
		}
		else if (income <= 1600000.0)
		{
			System.out.println("15% tax on your income");
		}
		else if (income <= 2000000.0)
		{
			System.out.println("20% tax on your income");
		}
		else if (income <= 2400000.0)
		{
			System.out.println("25% tax on your income");
		}
		else if (income > 2400000.0)
		{
			System.out.println("30% tax on your income");
		}
	}
}
