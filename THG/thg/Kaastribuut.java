package thg;

public class Kaastribuut extends Vastane{
	int elud = 80;
	int damage = 6;
	public Kaastribuut(int elud, int damage) {
		this.elud = elud;
		this.damage = damage;
	}
	
	public void v�itlus_tribuudiga (M�ngija a){
	
		System.out.println("Oi-oi, kuuled liikumist ja eikusagilt ilmub v�lja Sinu kaasv�istleja. Mida teed? \n"
				+ "[V�itlemiseks vajuta [S], p�genemiseks [E]]");
		v�itlus(a);
	}
		
public static void main(String[] args) {
		M�ngija katniss = new M�ngija("Katniss", 10);
		v�itlus_tribuudiga(katniss);	
	}	
}

