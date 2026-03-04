import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int cnt=0;
		for (int i=num ; i!=0 ; i/=10 )
		{
			cnt++;
		}
		if (cnt%2==0)
		{
			int pow =1;
			for (int i=0 ; i<cnt/2 ; i++ )
			{
				pow *= 10;
			}
			
			int firstHalf = num/pow;     //2025 --> 20
			int secondHalf= num%pow;     //2025 --> 25
			
			int total = firstHalf+secondHalf;
			
			if ((total*total)==num)
			{
				System.out.println("Its a tech Number ");
			}
			else{
				System.out.println("not a tech number");
			}
		}
		else {
			System.out.println("Not Tech No");
		}
	}
}
