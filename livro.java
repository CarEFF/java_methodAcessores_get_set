package main;

public class livro {
	
		private String titulo;
		private String autor;
		private String  isbn;
		private int numeroDePaginas;
		private String   valorDeCompra;
		
		
		public livro(String titulo, String autor, String isbn, int numeroDePaginas, String valorDeCompra) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.numeroDePaginas = numeroDePaginas;
			this.valorDeCompra = valorDeCompra;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public int getNumeroDePaginas() {
			return numeroDePaginas;
		}
		public void setNumeroDePaginas(int numeroDePaginas) {
			this.numeroDePaginas = numeroDePaginas;
		}
		public String   getValorDeCompra() {
			return valorDeCompra;
		}
		public void setValorDeCompra(String   valorDeCompra) {
			this.valorDeCompra = valorDeCompra;
		}
		
		
	
}
