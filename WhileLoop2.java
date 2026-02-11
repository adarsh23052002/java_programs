import java.util.Scanner;
class WhileLoop2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Which numbers's table you want : ");
		int num = sc.nextInt();
		int i=1;
		
		while (i<=10)
		{
          System.out.println(num+" x "+i+" = "+num*i);
		  i++;
		}
		
	}
}
