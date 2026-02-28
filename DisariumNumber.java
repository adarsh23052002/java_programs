import java.util.Scanner;
class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		
		int sum=0, temp=num;
		
		while (temp!=0)
		{
			int count=0;
			for (int i=temp ; i!=0 ; i/=10 )
			{
				count++;
			}
			
			int pow=1;
			int last=temp%10;
			for (int i=0; i<count ;i++ )
			{
				pow *= last;
			}
			
			sum += pow;
			temp /=10;
		}
		
		if (sum==num)
		{
			System.out.println("It's a disarium no. ");
		}
		else{
			System.out.println("not a disarium");
		}
	}
}
