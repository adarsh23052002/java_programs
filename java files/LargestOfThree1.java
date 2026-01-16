class LargestOfThree1
{
   public static void main(String[]args)
     {
       int n1=100, n2=200, n3=300;
  
      
      int largest = n1>(n2>n3 ? n2:n3) ? n1 :(n2>n3 ? n2:n3) ;

      System.out.println(largest);
     }
}