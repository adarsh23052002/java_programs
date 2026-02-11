import java.util.Scanner;
class PinValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int pin=1234;
		
		int attempt = 0;
		
		do
		{
			System.out.println("Enter your pin : ");
		    int enterPin = sc.nextInt();
		     
			 
			if(pin==enterPin) 
			{
				System.out.println("Login Successful!");
			    break;
			}else{
				attempt++;
				System.out.println("Invalid Pin! attempt left : "+(3-attempt));
			     }  
		}
		while (attempt<3);
		
		if (attempt==3)
		{
			System.out.println("Maximum attempt reached!");
		}
		
	}
}
