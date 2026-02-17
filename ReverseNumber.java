import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String str =num + "";
		String rev ="";
		
	/*	int i=0;                   //using while loop
		
		while(str.length()>i)
		{
			char ch = str.charAt(i);
			rev = ch + rev;
			i++; 
		}
	*/	
		
		
      for (int i=0 ;i<str.length() ;i++)
		{
			char ch = str.charAt(i);
			rev= ch + rev;
		}
		
	System.out.println(rev);
	}
}	