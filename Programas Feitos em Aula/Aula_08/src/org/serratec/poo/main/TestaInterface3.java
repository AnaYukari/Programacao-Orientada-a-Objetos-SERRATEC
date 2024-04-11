package org.serratec.poo.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Atleta;
import org.serratec.poo.classes.ComissaoTecnica;
import org.serratec.poo.classes.EstadoCivil;
import org.serratec.poo.classes.Olimpiadas;
import org.serratec.poo.classes.País;
import org.serratec.poo.classes.Treinador;

public class TestaInterface3 {
	public static void main(String[] args) {
		List<Olimpiadas> timeDasOlimpiadas = new ArrayList<>();
		
		País brasil = new País ("Brasil");
		País argentina = new País ("Argentina");
		
		Atleta atleta1 = new Atleta("Amandinha", "peso medio", brasil);
		atleta1.setPeso(93.45);
		atleta1.setEstadoCivil(EstadoCivil.CASADO);

		
		Atleta atleta2 = new Atleta("Fernanda", "peso pesado", argentina);
		atleta2.setPeso(92.56);
		atleta2.setEstadoCivil(EstadoCivil.VIUVO);
		
		System.out.println(atleta1 + atleta1.verificaSituacao());
		System.out.println(atleta2 + atleta2.verificaSituacao());
		
		ComissaoTecnica fulano1 = new ComissaoTecnica("Albertinho", "entregador de água", brasil);
		fulano1.setEmDiaComAsObrigacoesLegais(true);
		
		Treinador treinador1 = new Treinador("Kailin", LocalDate.parse("2025-04-23"), brasil);
		
		timeDasOlimpiadas.add(atleta1);
		timeDasOlimpiadas.add(atleta2);
		timeDasOlimpiadas.add(treinador1);
		timeDasOlimpiadas.add(fulano1);
		
//		for (Olimpiadas membro : timeDasOlimpiadas) {
//			System.out.println(membro.verificaSituacao());
//		}
	}
}
