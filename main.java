package main;

public class main {
	public static void main(String[] args) {
		//Pessoa eu = new Pessoa();
		
		//eu.setNome("Carlos");
		//eu.setIdade(21);
		//eu.setCpf("852.456.879-98");
		
		
		//Pessoa eu = new Pessoa("Carlos", 21, "654.987.321-65");
		
		//System.out.println("Objeto �:" +eu);
		//System.out.println("Seu nome �: " +eu.getNome());
		//System.out.println("Sua idade �: "+eu.getIdade());
		//System.out.println("Seu CPF �: "+eu.getCpf());
		
		//MET�DOS ACESSORES
		/*veiculo carro = new veiculo();
		carro.setPlaca("ABN987");
		carro.setCor("Preto");
		carro.setNumeroDePassafeiros(5);
		carro.setCapacidadeMaxima("100 litros");
		carro.setVelocidadeAtual("80km");
		carro.setConsumoMedio("10 com 1 litro");
		*/
		//CONSTRUTOR 
		veiculo carro = new veiculo("ASD987", "PRETO", 5, "150 LITROS", "100 KM", "13 POR LITRO")
		;
		//MET�DOS ACESSORES
		/*livro biblioteca = new livro();
		biblioteca.setTitulo("AVATAR");
		biblioteca.setAutor("CARLOS EMANUEL");
		biblioteca.setIsbn("987-54-65465-0-7");
		biblioteca.setNumeroDePaginas(100);
		biblioteca.setValorDeCompra("11,99");
		*/
		//CONSTRUTOR
		livro biblioteca = new livro("SUPER MAN", "CARLOS XARLIX", "654-89-132654-8-7", 130, "59,99");
		
		
		System.out.println("--------LOJA DE CARROS-------");
		System.out.println("INFORMA��ES DO CARRO A VENDA");
		
		System.out.println("PLACA DO CARRO: "+carro.getPlaca());
		System.out.println("COR DO CARRO: "+carro.getCor());
		System.out.println("CAPACIDADE PARA PASSAGEIROS: "+carro.getNumeroDePassafeiros());
		System.out.println("CAPACIDADE M�XIMA DE COMBUSTIVEL: "+carro.getCapacidadeMaxima());
		System.out.println("VELOCIDADE M�XIMA: "+carro.getVelocidadeAtual());
		System.out.println("CONSUMO M�DIO DO CARRO: "+carro.getConsumoMedio());
		
		System.out.println("---------LOJA DE LIVROS---------");
		
		System.out.println("UNICO LIVRO A VENDA:");
		System.out.println("TITULO DO LIVRO: "+biblioteca.getTitulo());
		System.out.println("AUTOR DO LIVRO: "+biblioteca.getAutor());
		System.out.println("ISBN DO LIVRO: "+biblioteca.getIsbn());
		System.out.println("N�MERO DE P�GINAS: "+biblioteca.getNumeroDePaginas());
		System.out.println("VALOR DO LIVRO: "+biblioteca.getValorDeCompra());
		
		
		
	}


}
