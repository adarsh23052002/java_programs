class LargestOfThree
{
   public static void main(String[]args)
     {
       int n1=100, n2=200, n3=300;
  
      int large;
      int largest = n1>(large= n2>n3 ? n2:n3) ? n1 : large ;

      System.out.println(largest);
     }
}