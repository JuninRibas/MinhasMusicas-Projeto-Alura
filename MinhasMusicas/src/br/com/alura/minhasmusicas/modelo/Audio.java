package br.com.alura.minhasmusicas.modelo;

public class Audio {
		
	private String titulo;
	private int totalReproducao;
	private int totalCurtidas;
	private int classificacao;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTotalReproducao() {
		return totalReproducao;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	public void reproduz() {
		this.totalReproducao++;
	}
	public void curte() {
		this.totalCurtidas++;
	}
	
	
}
