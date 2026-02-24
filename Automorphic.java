import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{ 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int sq = num*num;
		int pow=1;
		for (int i=num ; i!=0 ; i/=10 )
		{ 
			pow *=10;
		}
		if (sq%pow==num)
		{
			System.out.println("It's a automorphic");
		}
		else{
			System.out.println("not a Automorphic");
		} 
		
		
		
	/*	int count=0, pow=1;
		for (int i =num ; i!=0 ; i/=10 )
		{
			count++;
		}
		
		while (count>0)
		{
			pow *= 10;                                            // larger one idea
			count--;
		}
		if (sq%pow==num)
		{
		  System.out.println("It's a automorphic");
		}
		else{
			System.out.println("not a Automorphic");
		}
	*/
	
	
	
	}
}
