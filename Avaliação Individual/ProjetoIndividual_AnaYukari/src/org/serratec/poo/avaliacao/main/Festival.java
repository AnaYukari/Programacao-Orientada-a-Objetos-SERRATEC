package org.serratec.poo.avaliacao.main;

import org.serratec.poo.avalicao.classes.Banda;
import org.serratec.poo.avalicao.classes.Cantor;
import org.serratec.poo.avalicao.classes.Evento;
import org.serratec.poo.avalicao.classes.Palco;
import org.serratec.poo.avalicao.classes.generoMusical;

public class Festival {
	public static void main(String[] args) {

		Palco palco1 = new Palco("Principal", 800); 
		Palco palco2 = new Palco ("Secundário", 500);
		
		Banda banda1 = new Banda("Red Hot Chilli Pepper", generoMusical.HEAVYMETAL, 187.80);
		Banda banda2 = new Banda("The Cure", generoMusical.HEAVYMETAL, 190.60);
		Banda banda3 = new Banda("Kiss", generoMusical.HEAVYMETAL, 250.60);
		Banda banda4 = new Banda("Maneva", generoMusical.REAGGE, 130.30);
		
		Cantor cantor1 = new Cantor("Iza", generoMusical.MPB, 115.30);
		Cantor cantor2 = new Cantor("Ludmila", generoMusical.PAGODE, 140.70);
		Cantor cantor3 = new Cantor("Luan Santana", generoMusical.SERTANEJO, 140.70);                                                        
		Cantor cantor4 = new Cantor("Taylor Swift", generoMusical.POP, 140.70);                                                        
		                                                
	
		Evento evento1 = new Evento("05/06/2024","10h00", banda1.getNomeArtista());
		Evento evento2 = new Evento("05/06/2024","11h30", banda2.getNomeArtista());
		Evento evento3 = new Evento("05/06/2024","13h30", cantor1.getNomeArtista());
		Evento evento4 = new Evento("05/06/2024","15h30", cantor2.getNomeArtista());
		Evento evento5 = new Evento("05/06/2024","17h30", banda3.getNomeArtista());                                                 
		Evento evento6 = new Evento("05/06/2024","19h00", banda4.getNomeArtista());                                                 
		Evento evento7 = new Evento("05/06/2024","20h40", cantor3.getNomeArtista());                                                 
		Evento evento8 = new Evento("05/06/2024","21h30", cantor4.getNomeArtista());                                                 

		
		palco1.adicionaEvento(evento1);
		palco1.adicionaEvento(evento2);
		palco1.adicionaEvento(evento3);
		palco1.adicionaEvento(evento4);
		palco2.adicionaEvento(evento5);                                                                                              
		palco2.adicionaEvento(evento6);  
		palco2.adicionaEvento(evento7);                                                                                              
		palco2.adicionaEvento(evento8);                                                                                              
                                                           
		System.out.println(palco1);
		System.out.println("\n" + palco2);
		
	}
}
