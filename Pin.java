import java.util.*;
class Pin 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc= new  Scanner(System.in);
		int duration = 2000;
		
		infiniteLoop:
			for (; ; )
			{
			  int attempt = 3;
			  do
			  {
				  System.out.print("\n Enter your pin : ");
				  String userPin = sc.next();
				  String myPin = System.getenv(" mypin ");
				  
				  if (userPin.equals(myPin))
				  {
					  System.out.println("\n Phone Unlocked \n");
					  break infiniteLoop;
				  }
				  System.out.println("\n Invalid Pin ");
				  System.out.println("Attempt left : "+(attempt-1));
				  attempt--;
			  }
			  while (attempt!=0);
			  System.out.println("\n Phone is disabled for "+(duration/1000)+"sec \n");
			  Thread.sleep(duration);
			  duration *=2;
			}
	}
}
