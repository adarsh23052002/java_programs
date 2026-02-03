import java.util.Scanner;
class ReadData1
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println(" Enter your name :");
   String st= sc.nextLine();

   System.out.println(" Collage name :");
   String st3= sc.nextLine();

   System.out.println(" Qualification :");
   String st4= sc.nextLine();

   System.out.println(" Enter your age :");
   byte b1= sc.nextByte();
 
   System.out.println(" Year of passout :");
   short s1= sc.nextShort();
 
   System.out.println(" CGPA ");
   float f1= sc.nextFloat();

   System.out.println(" Mobile no. :");
   long l1= sc.nextLong();

   System.out.println(" Blood group :");
   char ch2 = sc.next().charAt(0);

   System.out.println(" location :");
   String st5= sc.next();

     sc.nextLine();

   System.out.println(" Primary skill :");
   String st1 = sc.nextLine();

   System.out.println(" expected salary per month :");
   int n1= sc.nextInt();
 
   System.out.println(" gender :");
   char ch5 = sc.next().charAt(0);

   System.out.println(" Are you fresher (true/false) :");
   boolean bo = sc.nextBoolean();

   
   System.out.println(" Enter your date of birth :");
   String st2 = sc.next();
  

   System.out.println(st);
   System.out.println(st3);
   System.out.println(st4);
   System.out.println(b1);
   System.out.println(s1);
   System.out.println(f1);
   System.out.println(l1);
   System.out.println(ch2);
   System.out.println(st5);
   System.out.println(st1);
   System.out.println(n1);
   System.out.println(ch5);
   System.out.println(bo);
   System.out.println(st2);

  }
}
