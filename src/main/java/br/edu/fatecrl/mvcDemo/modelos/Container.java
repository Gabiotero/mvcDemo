package br.edu.fatecrl.mvcDemo.modelos;

public class Container {
	
	private String produto;
	private int pesoToneladas;
	private int tamanhoM3;
	
	public Container(String produto, int pesoToneladas, int tamanho) {
		this.produto = produto;
		this.pesoToneladas = pesoToneladas;
		this.tamanhoM3 = tamanho;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(int pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}

	public int getTamanho() {
		return tamanhoM3;
	}

	public void setTamanho(int tamanho) {
		this.tamanhoM3 = tamanho;
	}
	
}
