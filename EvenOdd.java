import java.util.Scanner;
class EvenOdd{
     
       public static void main (String[]args)
      {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     int num = sc.nextInt();

     String op=
     (num%2==0 || num%2!=0)?
     ((num%2==0)?(num+" is  even"):(num+" is  odd" )):
     ("is not a number");

      System.out.println(op);
}}