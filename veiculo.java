package main;

public class veiculo {
		
		private String  placa;
		private String cor;
		private int numeroDePassafeiros;
		private String  capacidadeMaxima;
		private String velocidadeAtual;
		private String consumoMedio;
		
		
		public veiculo(String placa, String cor, int numeroDePassafeiros, String capacidadeMaxima,
				String velocidadeAtual, String consumoMedio) {
			super();
			this.placa = placa;
			this.cor = cor;
			this.numeroDePassafeiros = numeroDePassafeiros;
			this.capacidadeMaxima = capacidadeMaxima;
			this.velocidadeAtual = velocidadeAtual;
			this.consumoMedio = consumoMedio;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String  placa) {
			this.placa = placa;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getNumeroDePassafeiros() {
			return numeroDePassafeiros;
		}
		public void setNumeroDePassafeiros(int numeroDePassafeiros) {
			this.numeroDePassafeiros = numeroDePassafeiros;
		}
		public String  getCapacidadeMaxima() {
			return capacidadeMaxima;
		}
		public void setCapacidadeMaxima(String  capacidadeMaxima) {
			this.capacidadeMaxima = capacidadeMaxima;
		}
		public String getVelocidadeAtual() {
			return velocidadeAtual;
		}
		public void setVelocidadeAtual(String velocidadeAtual) {
			this.velocidadeAtual = velocidadeAtual;
		}
		public String getConsumoMedio() {
			return consumoMedio;
		}
		public void setConsumoMedio(String consumoMedio) {
			this.consumoMedio = consumoMedio;
		}
		
		
		
		
	
}
