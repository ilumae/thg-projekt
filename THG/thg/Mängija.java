package thg;

public class M�ngija {
	
	int lives = 100;
	String nimi;
	int piirkond;
	
	public M�ngija(String nimi, int piirkond) {
		this.lives = 100;
		this.nimi = nimi;
		this.piirkond = piirkond;
	}
	
	public int lives1(String a, int lives){
		if (a=="+"){
			lives += (int)(Math.random()*50 +1);
			if(lives > 150){
				lives = 150;
			}
		}
		else{
			lives -= (int)(Math.random()*100 + 1);
			if (lives < 1){
				gameover();
			}
		}
		
		System.out.println("Elusid on Sul n��d: " + lives);
		return lives;
	}
	
	public int lives1(int lives, int damage){
		lives =- (int)(Math.random()* (damage * 10) + 1);
		if (lives < 1){
			gameover();
		}
		System.out.println("Elusid on Sul n��d: " + lives);
		return lives;
		
	}
	
	public int p�evad(int a){
		System.out.println("Seekord �nnestus sul p�ev �le elada.. ");
		a += 1;
		if (a== 5){
			gameover(a);
		}
		return a;
	}
	
	public void gameover(){
		System.out.println("Kahjuks k�las kahuripauk ning sinust ei saanud j�rgmist N�ljam�ngude v�itjat...");
	}
	
	public void gameover(int a){
		System.out.println("JESS!! SINA oledki uusim N�ljam�ngude v�itja!");
	}
	
	public void sammude_kirjeldus(int h, int v){
		if (h==1){
			if (v==0){
				System.out.println("VULKAANIJALAM [^] [v] S�GAV ORG J�EGA");
				System.out.println("K�LLUSESARV [<] [>] METS");
			}
			else if (v==-2){
				System.out.println(" METS [^] [v] EI SAA K�IA, SIIN ON AREENI PIIR");
				System.out.println(" ORUP�HI [<] [>] METS");
			}
			else if (v==-1){
				System.out.println(" METS [^] [v] METS ");
				System.out.println(" ORUN�LV[<] [>] METS");
			}
			else if (v==2){
				System.out.println(" EI SAA K�IA, SIIN ON AREENI PIIR[^] [v] VULKAANIJALAM");
				System.out.println(" VULKAANITIPP [<] [>] METS");
			}
			else{
				System.out.println(" VULKAANIJALAM[^] [v] METS");
				System.out.println(" VULKAANIJALAM[<] [>] METS");
			}
		}
		else if (h==2){
			if (v==-2){
				System.out.println(" METS[^] [v] EI SAA K�IA, SIIN ON AREENI PIIR");
				System.out.println(" METS[<] [>] EI SAA K�IA, SIIN ON AREENI PIIR");
			}
			else if (v==-1){
				System.out.println(" METS [^] [v] METS");
				System.out.println(" S�GAV ORG J�EGA[<] [>] EI SAA K�IA, SIIN ON AREENI PIIR");
			}
			else if(v==0){
				System.out.println("METS [^] [v] METS");
				System.out.println("METS [<] [>] EI SAA K�IA, SIIN ON AREENI PIIR");
			}
			else if (v==1){
				System.out.println("METS [^] [v] METS");
				System.out.println(" VULKAANIJALAM[<] [>] EI SAA K�IA, SIIN ON AREENI PIIR");
			}
			else{
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [^] [v] METS");
				System.out.println("VULKAANIJALAM [<] [>] EI SAA K�IA, SIIN ON AREENI PIIR");
			}
		}
		else if (h==0){
			if(v==-2){
				System.out.println("ORUN�LV [^] [v] EI SAA K�IA, SIIN ON AREENI PIIR");
				System.out.println("VEEKOGU [<] [>] METS");
			}
			else if (v==-1){
				System.out.println(" K�LLUSESARV [^] [v] S�GAV ORG J�EGA");
				System.out.println(" VEEKOGU[<] [>]S�GAV ORG J�EGA ");
			}
			else if (v==0){
				System.out.println("VULKAANIJALAM [^] [v] ORUN�LV");
				System.out.println("VEEKOGU [<] [>] METS");
			}
			else if (v==1){
				System.out.println("VULKAANITIPP [^] [v] K�LLUSESARV");
				System.out.println("VULKAANIJALAM [<] [>] VULKAANIJALAM");
			}
			else{
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [^] [v] VULKAANIJALAM");
				System.out.println("VULKAANIJALAM [<] [>] VULKAANIJALAM");
			}
		}
		else if (h==-1){
			if (v==-2){
				System.out.println("VEEKOGU [^] [v] EI SAA K�IA, SIIN ON AREENI PIIR");
				System.out.println("VEEKOGU [<] [>] S�GAV ORG J�EGA");
			}
			else if (v==-1){
				System.out.println("VEEKOGU [^] [v] S�GAV ORG J�EGA");
				System.out.println("POOLSAAR [<] [>] ORUN�LV");
			}
			else if (v==0){
				System.out.println("VULKAANIN�LV [^] [v] VEEKOGU");
				System.out.println("POOLSAAR [<] [>] K�LLUSESARV");
			}
			else if (v==1){
				System.out.println("VULKAANIN�LV [^] [v] VEEKOGU");
				System.out.println("T�HERMAA/KIVISTUNUD LAAVA [<] [>] VULKAANIN�LV");
			}
			else{
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [^] [v] VULKAANIN�LV");
				System.out.println("T�HERMAA/KIVISTUNUD LAAVA [<] [>] VULKAANITIPP");
			}
		}
		else if(h==-2){
			if (v ==-2){
				System.out.println("POOLSAAR [^] [v] EI SAA K�IA, SIIN ON AREENI PIIR");
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [<] [>] S�GAV ORG J�EGA");
			}
			else if (v == -1){
				System.out.println("POOLSAAR [^] [v] VEEKOGU");
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [<] [>] VEEKOGU");
			}
			else if (v ==0){
				System.out.println("T�HERMAA/KIVISTUNUD LAAVA [^] [v] POOLSAAR");
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [<] [>] VEEKOGU");
			}
			else if (v ==1){
				System.out.println("T�HERMAA/KIVISTUNUD LAAVA [^] [v] POOLSAAR");
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [<] [>] VULKAANIJALAM");
			}
			else{
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [^] [v] T�HERMAA/KIVISTUNUD LAAVA");
				System.out.println("EI SAA K�IA, SIIN ON AREENI PIIR [<] [>] VULKAANIN�LV");
			}
		}
		
	}
	
	public void juhtumid(int p�evad){
		int juhtum = (int)(Math.random()*5+1);
		if (juhtum == 1){
			Mutant m = new Mutant();
			m.v�itlus_mutandiga(this);
		}
		else if (juhtum == 2){
			Ressurss r = new Ressurss();
			r.metsamari(this);
		}
		else if (juhtum == 3){
			Kaastribuut k = new Kaastribuut(80,6);
			k.v�itlus_tribuudiga(this);
		}
		else if (juhtum ==4){
			p�evad(p�evad);
		}
		else{
			Ressurss l = new Ressurss();
			l.langevari(this);
		}
	}
	
	int getLives() {
		return lives;
	}
	void setLives(int lives) {
		this.lives = lives;
	}
	String getNimi() {
		return nimi;
	}
	void setNimi(String nimi) {
		this.nimi = nimi;
	}
	int getPiirkond() {
		return piirkond;
	}
	void setPiirkond(int piirkond) {
		this.piirkond = piirkond;
	}
}
