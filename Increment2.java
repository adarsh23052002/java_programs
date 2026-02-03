class Increment2
{  public static void main(String[]args)
   {
    int p=-3, q=8 , r=13, s;

    s=p++ - q-- * r;
    q=--q + s++ - --q;
    p=p++ * p-- + r;
    r= r--;

    System.out.println("p:" +p);
    System.out.println("q:" +q);
    System.out.println("r:" +r);
    System.out.println("s:" +s);
   }
}