package org.serratec.poo.classes;

public class Operacao implements Opcao {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	public String toString() {
		return "\nTipo da Operação: " + tipo + "\nValor da Operacao: R$" + valorOperacao + "\n" + livro;
	}

	public void emprestar() {
		tipo = "Empréstimo";
		valorOperacao = livro.getValor() * Opcao.taxaEmprestimo / 100;	}

	public void vender() {
		tipo = "Venda";
		valorOperacao = livro.getValor();
	}
}
