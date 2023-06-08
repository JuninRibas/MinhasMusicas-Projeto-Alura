package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.PodCast;

public class Principal {
	public static void main(String[] args) {
		
		Musica musica = new Musica();
		
		musica.setTitulo("Voa Beija Flor");
		musica.setCantor("Jorge e Matheus");
		musica.setGenero("Sertanejo");
		
		for (int i = 0; i < 1000; i++) {
			musica.reproduz();
		}
		for (int i = 0; i < 3000; i++) {
			musica.curte();
		}
		
		PodCast podcast = new PodCast();
		
		podcast.setTitulo("Flow PodCast");
		podcast.setApresentador("Igão e Mítico");
		podcast.setDescricao("PodCast da Favela");
		
		for (int i = 0; i < 5000; i++) {
			podcast.reproduz();
		}
		for (int i = 0; i < 1000; i++) {
			podcast.curte();
		}
		
		MinhasPreferidas prefiridas = new MinhasPreferidas();
		
		prefiridas.inclui(podcast);
		prefiridas.inclui(musica);
		
	}

}
