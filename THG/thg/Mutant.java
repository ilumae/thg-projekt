package thg;

public class Mutant extends Vastane{
	int elud = 120;
    int damage = 8;
    
	public Mutant(int elud, int damage) {
		this.elud = elud;
		this.damage = damage;
	}
    
	public void v�itlus_mutandiga (M�ngija a){
		
		System.out.println("Oi-oi, kuuled liikumist ja eikusagilt ilmub v�lja kole mutant. Mida teed? \n"
				+ "[V�itlemiseks vajuta [S], p�genemiseks [E]]");
		v�itlus(a);
	}
}
