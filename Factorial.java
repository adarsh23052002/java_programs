import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int fact = 1;
		
		 /* // OR
		 
		 while (num>0)
		 {
			 fact= num*fact;
			 num--;
			 
		 }
		 */
		 
		 for (int i=num ; i>0 ;i-- )
		 {
			fact= i*fact; 
		 }
		 System.out.println("Factorial of "+num+" is : "+fact); 
	}
}
