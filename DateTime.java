import java.util.*;
import java.time.*;
class DateTime 
{
	public static void main(String[] args) 
	{
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a);
		System.out.println(a.getYear());
		System.out.println(a.getMonth());
		System.out.println(a.getDayOfWeek());
		System.out.println((a.getHour())%12+" : "+a.getMinute()+" : "+a.getSecond());
	}
}
