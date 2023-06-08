package br.com.alura.minhasmusicas.modelo;

public class PodCast extends Audio{
	private String apresentador;
	private String descricao;
	
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int getClassificacao() {
		if(getTotalReproducao()>=1000) {
			return 10;
		}else {
			return 7;
		}
	}
	
}
