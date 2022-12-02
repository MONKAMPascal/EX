package ROBOT;
import java.util.*;
public class Fight extends Robot {	
	protected String nom;
	protected int pvie;
	protected float seed;
	public  Fight() {
		this.nom =" ";
		this.pvie =10;
	}
	public Fight(String nom) {
		this.nom = nom;
		this.pvie =10;
	}
	public String getNom(){
		return nom;
	}
	public void setNom(String n) {
		this.nom =n;
	}
	public void Affiche(){
		System.out.println("Fighter: \t" +nom);
	}
	public void Bad(Robot axs){
		axs.pvie +=0;
		System.out.println("le Robot"+this.nom+" a louper "+axs.nom);
	}
	public void Fire(Robot aio){
		aio.pvie -=2;
		System.out.println("le Robot"+this.nom+" a toucher le Robot: "+aio.nom);
	}
	public void bad(Robot aoi)
	{
		aoi.pvie +=0;
		System.out.println("le Robot "+this.nom+"le Robot a louper le Robot "+aoi.nom);
	}
	public void th(){
		System.out.println("il a recu une balle de: "+this.getNom());
	}
	public void isDead(){
		if(this.getPvie() <= 0){
			System.out.println(this.getNom()+" est mort RIP ");
		}
		else{
			System.out.println(this.getNom()+" est toujour debout :\t" +this.getPvie()+" point de vie\n");
		}	
	}
	public void fire(Fight bnb) {
		Random round = new Random();
		if(round.nextBoolean()){
			int v=bnb.getPvie()-2;
			bnb.setPvie(v);
			System.out.println(bnb.getNom()+" est touche par: \t" +this.getNom()+"\n");
		}
	}
	public void fire(Robot busd) {
		Random round = new Random();
		if(round.nextBoolean()){
			int v=busd.getPvie()-2;
			busd.setPvie(v);
			System.out.println(""+busd.getNom()+" est touche par: \t" +this.getNom()+"\n");
		}
	}
}
