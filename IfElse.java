import java.util.Scanner;
class IfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Execution starts");
		
		// vowels or consonents
		System.out.print("Enter character :");
		char ch = sc.next().charAt(0);
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    {
			System.out.println("character is vowel");
		    }
		else
			{
			System.out.println("character is consonent");
		    }
		
	    System.out.println("");
	
       // even or odd numbers
		System.out.print("enter the number :");
		int num = sc.nextInt();
		
		if(num%2==0)
			{
			System.out.println(" It is a Even number");
		    }
		else
			{
			System.out.println(" It is a Odd number");
		    }
		
		System.out.println("Execution ends");
	}
}
