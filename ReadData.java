import java.util.Scanner;
class ReadData
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);

  System.out.println("Inter the first numbere");
  int n1= sc.nextInt();

  System.out.println("Inter the second number");
  int n2= sc.nextInt();

  int ans = n1+ n2;
  System.out.println(" The sum of " +n1+ " and " +n2+ " is " +ans);
  }
}