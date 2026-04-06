import java.util.Scanner;
class Frequency 
{
	public static void main(String[] args) 
	{
		int num=12254615;
	   
		for (int i=0;i<=9 ;i++ )
		{
			int cnt=0;
			for (int j=num;j!=0 ;j/=10 )
			{
				if (j%10==i)
				{
					cnt++;
				}
			}
			if (cnt>0)
			{
				System.out.println("frequency of " +i+" is -->"+cnt);
			}
			
	    }
	}
}
