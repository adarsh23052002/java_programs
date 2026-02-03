import java.util.Scanner;
class Circle1
{
	public static void main(String[] args) 
	{
		
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a radius (cm) :");
            double radius= sc .nextDouble();
			
            final double PI =22/7.0;
            final double AREA = PI*(radius*radius);
            final double PERIMETER =2*PI*radius;
			
            System.out.println("radius :"+radius+"cm");
            System.out.printf("area of circle : %.3f cm^2 %n",AREA);
            System.out.printf("Perimeter of circle : %.3f cm",PERIMETER);
			
	}
}
