package Aula_3;

public class Calçado {
	String tipo;
	String modelo;
	String cor;
	String estilo;
	int tamanho;
	double valor;
	
	public Calçado(String tipo, int tamanho, double valor) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Calçado [tipo=" + tipo + ", modelo=" + modelo + ", cor=" + cor + ", estilo=" + estilo + ", tamanho="
				+ tamanho + ", valor=" + valor + "]";
	}
	
	
	
	
}
