import java.util.Scanner;
class RotateNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		int cnt=0;
		int last = num%10;
		num /=10;
		for (int i=num ;i!=0 ;i/=10 )
		{
			cnt++;
		}
		int pow=1;
		for (int k=0 ; k<cnt ;k++ )
		{
			pow *=10;
		}
		 pow *= last;
		 num += pow;
		 
		 System.out.println(num);
		
	}
}
