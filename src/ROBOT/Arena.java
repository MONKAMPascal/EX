package ROBOT;
import java.util.*;
public class Arena {
	protected String n;
	public Arena(String A)
	{
		this.n = A;	
	}	
	public String fight(Robot pas, Robot cal) 
	{
		String pio=" ";
		while((pas.pvie !=0) && (cal.pvie !=0))
		{
			pas.Fire(cal);
			cal.th(pas);
			pas.isDead();
			if(cal.pvie != 0)
			{
				cal.Fire(pas);
				pas.th(cal);
				cal.isDead();
			}	
		}
		if(pas.pvie == 0)
		{
			pas.isDead();
			pio="le robot: \t"+cal.nom+"a gagner le Robot "+pas.nom;
		}
		if(cal.pvie == 0)
		{
			cal.isDead();
			 pio="le robot: \t"+pas.nom+"a gagner le Robot "+cal.nom;
		}
		return pio;
	}
		public String fight(Robot mon, Fight kam) 
		{
			String pao=" ";		
			do	
			{
					mon.Fire(kam);
					kam.th(mon);
					kam.isDead();
				
				if(kam.pvie != 0)
				{
					kam.fire(mon);
					mon.th(kam);
					mon.isDead();
				}
			}while((mon.pvie !=0) && (kam.pvie !=0));
			if(mon.pvie == 0)
			{
				mon.isDead();
				pao="le robot: \t"+kam.nom+"a gagner le Robot "+mon.nom;
				return pao;
			}
			if(kam.pvie == 0)
			{
				kam.isDead();
				 pao="le robot: \t"+mon.nom+"a gagner le Robot "+kam.nom;
				return pao;
			}
			return pao;
	}
		public String fight(Fight a, Fight b) 
		{
			String r=" ";
			do
			{
				if(a.getPvie() != 0)
				{
					a.fire(b);
					b.isDead();
				}
				if(b.getPvie() != 0)
				{	
						b.fire(a);
						a.isDead();	
				}
					
			}while((a.getPvie() !=0) && (b.getPvie() !=0));
			if(a.getPvie() == 0)
			{
				 r=""+b.getNom()+"a gagner "+a.getNom();
			}
			if(b.getPvie() == 0)
			{
				 r=""+a.getNom()+"a gagner "+b.getNom();	
			}
			return r;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Robot bob = new Robot("bob");
			Scanner sc = new Scanner(System.in);
			bob.Affiche();
			
			//test de combat entre D2R2 et Data
			Robot R1 = new Robot("");
			Robot R2 = new Robot("");
			Fight MAN1 = new Fight("");
			Fight MAN2 = new Fight("");
			
			Arena comb1 = new Arena("comb1");
	
			System.out.println("bienvenu sur le combat de robot de Pascal\n"
			+"*****quel combat vollez vous??*****\n"
			+"Tape 1 pour le combat Robot Vs Robot\n"
			+ "Tape 2 pour le combat Robot Vs Humain\n"
			+ "Tape 3 pour le combat Humain Vs Humain");
			int choix;
			choix = sc.nextInt();
			switch(choix)
			{
			case 1: 
				System.out.println("joueur 1 entre le nom de ton Robot");
				String n=sc.next();
				R1.setNom(n);
				
				System.out.println("joueur deux entre le nom de ton Robot");
				R2.setNom(sc.next());
				comb1.fight(R1, R2);
				break;
			case 2:
				System.out.println("joueur 1 entre le nom de ton robot");
				R1.setNom(sc.next());
				System.out.println("joueur 2 entre le non de ton combatant");
				MAN1.setNom(sc.next());
				comb1.fight(R1, MAN1);
				break;
			case 3:
				System.out.println("joueur 1 entre le non de ton combatant");
				MAN1.setNom(sc.next());
				System.out.println("joueur 2 entre le non de ton combatant");
				MAN2.setNom(sc.next());
				comb1.fight(MAN1, MAN2);
				break;
			default:
				System.out.println("Votre choix ne correspond pas aux chois proposer 1  !!!!!");
			}
		}
}
