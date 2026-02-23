import java.util.Scanner;
class FindPrime {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int ct = 0;
        
        for(int i=2;i<n;i++)
        {
            int den =2;
             while(den<i)
            { 
                if (i%den==0)
                {break;}
                den++;
            }
            if (den==i)
            {
                ct++;
            }
        }
        System.out.println("The total number of prime before "+n+" is "+ct);

        
    }
}
