import java.util.Scanner;
class Rectangle 
{
	public static void main(String[] args) 
	{
            Scanner sc= new Scanner(System.in);
			
            System.out.print("Enter the width (cm) :");
            double width = sc .nextDouble();
			System.out.print(" Enter the height (cm):");
			double height =sc.nextDouble();
			
            
            final double AREA = width*height;
            final double PERIMETER =2*(width+height);
            
            System.out.printf("area of circle : %.2f cm^2 %n",AREA);
            System.out.printf("Perimeter of circle : %.2f cm",PERIMETER);
 
	}
}
