public class Libro extends Medio {
	private int numeroPaginas;

	public Libro(String titulo, String autor, int anoPublicacion, Editorial editorial, int numeroPaginas) {
		super(titulo, autor, anoPublicacion, editorial);
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Libro: " + titulo + " , Autor: " + autor + " , Año: " + anoPublicacion + " , Paginas: "
				+ numeroPaginas + " , Editorial: " + editorial);

	}
}