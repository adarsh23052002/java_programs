import java.util.Scanner;
class VowelCons
{
   public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the Alphabet :");
 
    char ch = sc.next().charAt(0);

    String op=
      ((ch=='a' || ch=='A' || ch=='e'||ch=='E'||ch=='i'||ch=='o'||ch=='u'||ch=='I'||ch=='O'||ch=='U'))?
      (ch+ "is a vowel"):
      (ch+ "is a consonent");

   System.out.println(op);
     
     
}}