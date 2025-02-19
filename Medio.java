public abstract class Medio {
	protected String titulo;
	protected String autor;
	protected int anoPublicacion;
	protected Editorial editorial;

	public Medio(String titulo, String autor, int añoPublicacion, Editorial editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = añoPublicacion;
		this.editorial = editorial;
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

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public abstract void mostrarInfo();
}