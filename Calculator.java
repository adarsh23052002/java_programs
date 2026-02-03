import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the operand 1 : ");
	 double operand1 = sc.nextDouble();
	 
	 System.out.print("Enter the operator : ");
	 char operator = sc.next().charAt(0);
	 
	 System.out.print("Enter the operand 2 : ");
	 double operand2 = sc.nextDouble();
	 
	 
	 double  op=
		 (operator=='+')?(operand1 + operand2):
		 (operator=='-')?(operand1 - operand2):
		 (operator=='*')?(operand1 * operand2):
		 (operator=='/')?(operand1 / operand2):
		 (operator=='%')?(operand1 % operand2):
		 (Double.MAX_VALUE);
	 
	 if(op != Double.MAX_VALUE)
		System.out.println(operand1+ " " +operator+ " " +operand2+ " = " +op);
	 
	 else
		 System.out.println("Enter operator is  invalid");
		 
	}
}
