class Banking 
{
	static double balance;
	public static void main(String[] args) 
	{
		printBalance();
		deposit(100000);
		withdraw(10000);
		printBalance();
	}
	
	public static void printBalance()
	{
		System.out.println("Balance :"+balance);
	}
	public static void withdraw(double amt)
	{
		if (amt>0 && balance-amt>2000)
		{
			balance-=amt;
			System.out.println("Amount debited");
			System.out.println("your current balance is :"+balance);
		}
		else{
			System.out.println(amt>0?"Insufficiant balance":"Invalid amount");
		}
	}
	public static void deposit(double amt)
	{
		if (amt>0)
		{
			balance+=amt;
			System.out.println("Amount Deposited");
			System.out.println("Your current balance is :"+balance);
		}
		else{
			System.out.println("Invalid amount");
		}
	}
}
