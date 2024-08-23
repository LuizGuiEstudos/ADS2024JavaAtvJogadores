package entities;

public class Jogador {
	
	String nome;
	String time;
	int camisa;
	
	
	
	public String getNome() {
		return nome;
	}
	public String getTime() {
		return time;
	}
	public int getCamisa() {
		return camisa;
	}


	public Jogador(String nome, String time, int camisa) {
		this.nome = nome;
		this.time = time;
		this.camisa = camisa;
	}
	
	
	
}
