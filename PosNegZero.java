import java.util.Scanner;
class PosNegZero{
     
       public static void main (String[]args)
      {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     double num = sc.nextDouble();

     String op =
    ((num<=-1 || num>=1 )?
     (num<0)?("is a -ve number"):("is a +ve number"):
    (num==0)?("is a zero"):("is not a number"));
    
     System.out.println(op);
}}
