import java.util.Scanner;
class FeetToMeter{
            public static void main(String[]args)
             {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the length in feet (ft) :");
            double feet = sc .nextDouble();
			
            final double METERS =feet/0.305;
 
            System.out.printf("length in meters is: %.2f  m",METERS);
 }}