import java.util.Scanner;
class Special
{
   public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the special charscter :");
 
    char ch = sc.next().charAt(0);

    String op=
    ((ch>=0 && ch<=47)||(ch>=57 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127)?
     (ch+ "is a special charscter"):
      (ch+ "is not a special charscter"));

   System.out.println(op);
     
     
}}
