import java.util.Scanner;
class RotateAllDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		int temp=num;
		while (true)
		{
			int cnt=0;
		    int last = temp%10;
		    temp /=10;
		    for (int i=temp ;i!=0 ;i/=10 )
		    {
			  cnt++;
		    }
		    int pow=1;
		    for (int k=0 ; k<cnt ;k++ )
		    {
			  pow *=10;
		    }
		    pow *= last;
		    temp +=pow;
		 
		    System.out.println(temp);
			if (temp==num)
			{
				break;
			}
		}
		
	}
}
