import java.util.Scanner;
class PoundToKg{
            public static void main(String[]args)
             {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the weight in pound (lb) :");
            double pound = sc .nextDouble();
			
            final double KG =pound*0.454;
 
            System.out.printf("weight in kg is: %.3f  kg",KG);
 }}
