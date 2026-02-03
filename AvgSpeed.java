class AvgSpeed 
{
	public static void main(String[] args) 
	{
		double diskm = 14;
		double disMiles=14*0.62;
		double seconds= (45*60)+30;
		double hours=seconds/3600.0;
		
		final double AVGSPEED = disMiles/hours;
		System.out.printf("average speed in miles per hour is: %.2f mph",AVGSPEED);
	}
}
