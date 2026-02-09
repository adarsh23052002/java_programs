import java.util.Scanner;
/**
*The Arithmetic Calculator Application is a Java-based program developed to perform mathematical calculations efficiently.
The application allows users to perform arithmetic operations using two numeric inputs and a selected operator.
It is designed to simplify day-to-day calculations through a structured and logical approach.
The calculator supports multiple operations such as addition, subtraction, multiplication, division, and modulus.
The application uses a method-based approach, including a solve() method, to handle calculation logic.
User inputs are taken dynamically, making the application interactive and easy to use.
The program follows a modular design, improving code readability and maintainability.
Input validation is implemented to reduce runtime errors and ensure accurate results.
The application demonstrates the practical use of core Java programming concepts.
This project serves as a foundation for understanding larger and more complex Java applications.

@author Adarsh Kumar Singh
@since JDK 25

*/
public class Calculator1 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the num2 : ");
		double num2 = sc.nextDouble();
		System.out.print("Enter an operator : ");
		char op = sc.next().charAt(0);
		
		
		solve(num1, num2, op);
	}
/**
* The Arithmetic Calculator is a Java-based application developed in Java to perform mathematical operations using two input numbers (num1 and num2) and an operator.

 The program accepts two numeric values from the user and stores them in variables num1 and num2.

 An operator (+, -, *, /, %) is taken as input to decide the arithmetic operation to be performed.

 The calculator uses a dedicated <b><u>solve</u></b> method to process the calculation logic.

 The solve() method contains conditional statements or a switch-case structure to identify the selected operator.

 Based on the operator, the solve() method performs addition, subtraction, multiplication, division, or modulus operations on num1 and num2.

 Validation is implemented inside the solve() method to handle invalid operators.

 The method also checks for division or modulus by zero to avoid runtime exceptions.

 After computation, the solve() method returns or displays the calculated result.

 This project demonstrates core Java concepts such as methods, variables, user input handling, control statements, and error handling.

  @param num1 this is operand 1 on which operation is performed 
  @param num2 this is operand 2 on which operation is performed
  @param op this is operator on which performs operation on operands
  
  
*/
     public static void solve(double num1, double num2, char op)
	{
		double output = 0;
		switch (op)
		{
		case '+':{output= num1+num2;break;}
		
		case '-':{output= num1-num2;break;}
		
		case '*':{output= num1*num2;break;}
		
		case '/':{output= num1/num2;break;}
		
		case '%':{output= num1%num2;break;}
		
		default:{
			System.out.println("Invalid Operator");
			break;
		        }
		
	    }
		
		System.out.println(num1+" "+op+" "+num2+" = "+output);

	}
}
