import java.util.Scanner;
class Alphabet
{
           public static void main(String[]args)
            {
              Scanner sc= new Scanner(System.in);
              System.out.print("Enter the character :");
              char ch= sc.next().charAt(0);

              String op = 
               ((ch>=65 &&ch<=90)||(ch>='a' && ch<='z'))?
               (ch+" is an alphabet"):
               (ch+" is not an alphabet");
  
              System.out.println(op);
          
            }
    }