import java.util.Scanner;
class CelToFahr{
            public static void main(String[]args)
             {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the celsius (c) :");
            double celsius = sc .nextDouble();
			
            final double FAHRENHEIT =(9.0/5)*celsius+32;
 
            System.out.printf("temp in Fahrenheit is: %.2f  f",FAHRENHEIT);
 }}
