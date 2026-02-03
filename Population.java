
class Population{
            public static void main(String[]args)
             {
            long currPop = 312032486;
            long seconds =(365*24*60*60)*5;
  
            final long BIRTH= seconds/7;
            final long DEATH = seconds/13;
            final long IMMIGRANTS = seconds/45;

            long newPop = currPop + BIRTH-DEATH+IMMIGRANTS;
            System.out.println(" previous Pop :"+currPop);
             System.out.println(" new Pop : " + newPop);
  }}