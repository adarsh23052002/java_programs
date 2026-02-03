import java.util.Scanner;
class AlphaDigit
{
           public static void main(String[]args)
            {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the character :");
              char ch= sc.next().charAt(0);

              String op = 
               ((ch>=65 &&ch<=90)||(ch>='a' && ch<='z'))?
                       (ch+"is a  alphabet"):
               ((ch>=48 && ch<=57)?
                      (ch+ "is a digit"):
                       (ch+ "is not a aplhabet or digit"));
                
              System.out.println(op);
          
            }
    }