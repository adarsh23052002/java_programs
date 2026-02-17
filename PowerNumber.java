import java.util.Scanner;
class PowerNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
	    double num = sc.nextDouble();
		System.out.print("Enter a power : ");
		double power = sc.nextDouble();
		
		if (power<0)
		{
			power *= -1;
			num = 1/num;
		}
		
		double op = 1;
		for (int i=1 ; i<=power ;i++ )
		{
			op *= num;
		}
	
	System.out.println("user defined : "+op);
	System.out.println("built in : "+ Math.pow(num,power));
	}
}	