class StatVar2 
{
	static String name;
	public static void main(String[] args) 
	{
		System.out.println(name);
		name = "Adarsh";
		System.out.println(name);
		String name = "Sonu";
		System.out.println(name);
		test();
		System.out.println(StatVar2.name);
	}
	public static void test()
	{
		String name ="Adi";
		System.out.println(name);
	}
}
