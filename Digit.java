import java.util.Scanner;
class Digit
{
   public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the digit :");
 
    char ch = sc.next().charAt(0);

    String op=
    ((ch>=48 && ch<=57)?
     (ch+ "is a digit"):
      (ch+ "is not a digit"));

   System.out.println(op);
     
     
}}