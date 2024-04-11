package Aula_3;

public class Camisas {
	String tipo;
	String modelo;
	String material;
	String tamanho;
	String cor;
	double valor;
	
	public Camisas(String tipo, String modelo, double valor) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Camisas [tipo=" + tipo + ", modelo=" + modelo + ", material=" + material + ", tamanho=" + tamanho
				+ ", cor=" + cor + ", valor=" + valor + "]";
	}
	
	
	
	
}
