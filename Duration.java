import java.util.Scanner;
class Duration 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
		System.out.println();
		int duration = 100;
		int cnt = 1;
		
		for (char ch= 'A' ;ch<='Z' ;ch++ )
		{
			System.out.print(ch+" " );
			Thread.sleep(duration);
			duration +=100;
			cnt++;
			if (cnt%6==0)
			{
				duration=100;
			}
		}
		System.out.println();
		
	}
	
}
