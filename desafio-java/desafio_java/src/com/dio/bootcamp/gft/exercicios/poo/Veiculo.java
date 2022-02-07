package com.dio.bootcamp.gft.exercicios.poo;

public class Veiculo {
	private float cilindrada;
	private int capacidade;
	private String fabricante, modelo, cor, combustivel;
	
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
