class conditional2
{
  public static void main (String[]args)
   {
    int i1=10;
    int i2=20;
    int i3=30;

    int ans1= i1<i2 ? i1:i2;
    int ans2 = ans1<i3 ? ans1: i3;

    System.out.println(ans2); 
   }
}