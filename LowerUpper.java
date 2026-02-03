import java.util.Scanner;5
class LowerUpper
{
           public static void main(String[]args)
            {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the character :");
              char ch= sc.next().charAt(0);

              String op = 
               ((ch>=65 &&ch<=90)||(ch>='a' && ch<='z')?
               ((ch>=65 && ch<=90)?
                       (ch+"is a upper case alphabet"):
                       (ch+"is a lower case alphabet")) :
               (ch+ "is not a alphabet"));
                
              System.out.println(op);
          
            }
    }