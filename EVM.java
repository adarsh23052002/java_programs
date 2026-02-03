import java.util.Scanner;
class EVM 
{
	static int bjp, aap, cong, mns, nota;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the population of area : ");
		int population = sc.nextInt();
		
		for (int i=1 ;i<=population ;i++ )
		{
			System.out.println("\n **** WELCOME **** ");
			System.out.println(" APKA EK VOTE DESH BADAL SHAKTA HAI \n");
			System.out.println("1.BJP \n2.AAP \n3.CONG \n4.MNS \n5.NOTA");
			System.out.println("\nEnter your response :");
			String resp = sc.next().toUpperCase();
			
			if (resp.equals("BJP")){
				bjp++;
				System.out.println("YOU HAVE VOTED FOR BJP");
				System.out.println("ACCHE DIN AYENGE \n");
			}
			else if (resp.equals("AAP")){
				aap++;
				System.out.println("YOU HAVE VOTED FOR AAP");
				System.out.println("apka ek vote mujhe azad kar shkta hai\n");
			}
			else if (resp.equals("CONG")){
				cong++;
				System.out.println("YOU HAVE VOTED FOR CONG");
				System.out.println("BHARST JODO\n");
			}
			else if (resp.equals("MNS")){
				mns++;
				System.out.println("YOU HAVE VOTED FOR MNS");
				System.out.println("JAI MAHARASHTRA\n");
			}
			else if (resp.equals("NOTA")){
				nota++;
				System.out.println("YOU HAVE VOTED NOTA");
				System.out.println("oohhhh! u r educated\n");
			} else{
				System.out.println("Invalid response");
				i--;
			}
		}
		System.out.println("bjp: "+bjp);
		System.out.println("cong: "+cong);
		System.out.println("mns: "+mns);
		System.out.println("aap: "+aap);
		System.out.println("nota: "+nota);
		
		
		if (bjp>=cong && bjp>=mns && bjp>=aap && bjp>=nota)
		{
			System.out.println("BJP has won the election by "+bjp+"votes"); 
		}else if (cong>=bjp && cong>=mns && cong>= aap &&cong>=nota)
		{
		 System.out.println("CONG has won the election by "+cong+"votes"); 	
		}else if (mns>=bjp && mns>=cong && mns>=aap && mns>=nota)
		{
		 System.out.println("MNS has won the election by "+mns+"votes");	
		}else if (aap>=bjp && aap>=cong &&aap>=mns && aap>=nota)
		{
		 System.out.println("AAP has won the election by "+aap+"votes");	
		}else {
			System.out.println("no one has won the election");
		}
	}
}
