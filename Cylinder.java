import java.util.Scanner;
class Cylinder{
            public static void main(String[]args)
             {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the radius (cm) :");
            double radius= sc .nextDouble();
			System.out.println("Enter the height (cm) :");
			double height= sc .nextDouble();
			
            final double PI =22/7.0;
            final double AREA = PI*(radius*radius);
            final double VOLUME = AREA*height;
			
            System.out.println("radius :"+radius+"cm");
			System.out.println("height :"+height+"cm");
            System.out.printf("area of cylinder : %.3f cm^2 %n",AREA);
            System.out.printf("volume of cylinder : %.3f cm^3",VOLUME);
 }}
