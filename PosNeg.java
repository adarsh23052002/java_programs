import java.util.Scanner;
class PosNeg{
     
       public static void main (String[]args)
      {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     double num = sc.nextDouble();

     String op =
    ((num<0 || num>0)?(num<0)?(num+" is a -ve number"):(num+" is a +ve number"):("it is not a number"));
    
     System.out.println(op);
}}
