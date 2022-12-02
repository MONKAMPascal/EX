package ROBOT;
import java.util.*;
public class Robot {
	protected String nom;
	protected int pvie;
	
	public Robot (){
		this.nom =" ";
		this.pvie =10;
	}
	 Robot(String nom) {
		this.nom = nom;
		this.pvie =10;
	}
	public String getNom(){
		return nom;
	}
	public int getPvie(){
		return pvie;
	}
	public void setNom(String nom) {
		this.nom =nom;
	}
	public void setPvie(int pvie) {
		this.pvie =pvie;
	}
	public void Affiche(){
		System.out.println("Robot: \t" +nom);
	}
	public void Fire(Robot bnb){
		bnb.pvie -=2;
		System.out.println(bnb.nom+"est toucher ");
	}
	public void bad(Robot bbb){
		bbb.pvie +=0;
		System.out.println(this.getNom()+bbb.nom+" a esquive la balle de  "+this.nom);
	}
	public void th(Robot bbb)
	{
		System.out.println("il a recu une balle de: "+bbb.nom);
	}
	public void isDead()
	{
		if(this.getPvie() <= 0)
		{
			System.out.println(this.getNom()+" est detruit");
		}
		else
		{
			System.out.println("le Robot  "+this.getNom()+" est en vie: \t" +this.getPvie()+"\n");
		}
		
	}	
	public void fire(Fight aaa) {
		Random random = new Random();
		if(random.nextBoolean())
		{
			int v=aaa.getPvie()-2;
			aaa.setPvie(v);
			System.out.println(""+aaa.getNom()+" est touche par: \t" +this.nom+"\n");
		}
	}

}
