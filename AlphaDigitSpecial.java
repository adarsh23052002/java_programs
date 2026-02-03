import java.util.Scanner;
class AlphaDigitSpecial
{
           public static void main(String[]args)
            {
              Scanner sc= new Scanner(System.in);
              System.out.println("Enter the character :");
              char ch= sc.next().charAt(0);

              String op = 
               ((ch>=65 &&ch<=90)||(ch>='a' && ch<='z'))?
               ((ch>=65 && ch<=90)?
                       (ch+"is a upper case alphabet"):
                       (ch+"is a lower case alphabet")) :
               ((ch>=48 && ch<=57)?
                       (ch+"is a digit"): 
                       (ch+"is a special character"));
  
              System.out.println(op);
          
            }
    }