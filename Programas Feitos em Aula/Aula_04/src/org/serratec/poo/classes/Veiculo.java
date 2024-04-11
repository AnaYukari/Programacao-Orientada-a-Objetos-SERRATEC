package org.serratec.poo.classes;

public class Veiculo {
		private String marca;
		private String modelo;
		private String categoria;
		private String placa;
		private String cor;
		private int ano;
		
		
		
		public Veiculo(String marca, int ano, String placa) {
			this.marca = marca;
			this.ano = ano;
			this.placa = placa;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			if (marca.trim().isBlank()){
				System.out.println("Não pode ficar sem marca.");
				return;
			}
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		@Override
		public String toString() {
			return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", categoria=" + categoria + ", placa=" + placa
					+ ", cor=" + cor + ", ano=" + ano + "]";
		}
		
		//getters e setters
		// get - deixa outra classe ver o conteudo da forma que tiver programado no metodo
		//set - deixa inserir valor no pro atributo com suas devidas protreções
		
	}


