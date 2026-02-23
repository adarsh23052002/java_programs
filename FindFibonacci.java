import java.util.Scanner;
class FindFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =  sc.nextInt();
		  
        if(num>=0)
		{
		 while (num >0)
		 {
			 int last = num%10 ;
			 if(last==0 || last==1 || last==2 || last==3 || last==5 || last==8)
			 {
				 System.out.print(last+" ");
			 }
			 num /=10;
		 }
		}
		else{
			System.out.println("Invalid input");
		}
	}
}
