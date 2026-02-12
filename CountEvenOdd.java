import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int evenCount =0;
		int oddCount = 0;
		
		while (num>0)
		{
			if (num%2==0)
			{ 
				int eNum = num%10;
				evenCount++;
				num /=10;
			}
			else{
				int oNum = num%10;
				oddCount++;
				num /=10;
			}
		}
		System.out.println("Number of even digits is : "+evenCount);
		System.out.println("Number of odd digits is : "+oddCount);
	}
}
