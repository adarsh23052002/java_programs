import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int count=0;
		for (int i=num ; i!=0 ; i/=10 )
		{
			count++;
		}
		 int sum =0, temp=num;
		 while (temp!=0)
		 {
			 int last = temp%10;
			 int pow= 1;
			 for (int i=0 ; i<count ; i++ )
			 {
				 pow *= last;
			 }
			 sum += pow;
			 temp /= 10;
		 }
		 if (sum==num)
		 {
			 System.out.println("Its a armstrong no.");
		 }
		 else {
			System.out.println("not a armstrong no.");
		 }
	}
}
