package thg;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Ressurss{

	public void metsamari(M�ngija a) {
		double juh=Math.random()*10+1;
		System.out.printf("�hel p��sal kasvavad isu�ratavad valged marjad. Sa pole selliseid varem n�inud ja see ei tundu olevat nende loomulik kasvukoht.\n "
				+ "Proovid marju -vajuta [S].\n L�hed edasi - vajuta [E].\n ");
		
		Scanner scan=new Scanner(System.in);
		String sisend=scan.nextLine();

		if (sisend.equals("s")){
			try{
				TimeUnit.MILLISECONDS.sleep(700);
				}
				catch (InterruptedException e){
					System.out.println("");;
				}
			if (juh<=5){

			System.out.println("Enesetunne l�heb kehvaks...");
			a.muudaElusid("-");
			 }
			else{ 
				System.out.printf("T�itsa maitsev mari ju..enesetunne l�heb t�kk maad paremaks\n");
				a.muudaElusid("+");
			}
			}

		if (sisend.equals("e")) 
		{System.out.println("Liigud edasi");
		}
		
		}

		
	public void langevari(M�ngija a) {
		Random randomno=new Random();
		String [] valik = {"energiajook", "pakk tuletikke", "nuga"};
		
		String asi =valik[randomno.nextInt(valik.length)];
		System.out.println("M�rkad taevast langevat v�ikest langevarju, mis maandub sinust veidi eema. Korjad selle �les ja avad pakendi. Sees on: -" + asi);
		a.muudaElusid("+");
	}
	
	public void vulkaan(){
		System.out.println("Sa kuuled selja tagant tohutult valju plahvatust.");
		try{
			TimeUnit.MILLISECONDS.sleep(1300);
		}
		catch (InterruptedException e){
			System.out.println("");;
		}
		System.out.println("�mber p��rates saad aru, et vulkaan on hakanud purskama.\n Viie sekundi jooksul kattud kuuma tuhaga.\n "
				+ "M�ngumeistritel sai sust k�rini.\n Game Over.");
	}
}
