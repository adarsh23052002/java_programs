import java.util.Scanner;
class Absolute{
     
       public static void main (String[]args)
      {
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter the number:");
     int num = sc.nextInt();

     String op=
     (num<0*-1 || num>0)?
     ((num<0*-1)?("Absolute value is: "+num):("Absolute value is: "+num)):
     (num+" number cant't be changed to absolute value");

     }
}
