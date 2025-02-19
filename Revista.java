public class Revista extends Medio {
	private int numeroEdicion;

	public Revista(String titulo, String autor, int anoPublicacion, Editorial editorial, int numeroEdicion) {
		super(titulo, autor, anoPublicacion, editorial);
		this.numeroEdicion = numeroEdicion;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Revista: " + titulo + " , Autor: " + autor + " , Año: " + anoPublicacion + " , Edición: "
				+ numeroEdicion + " , Editorial: " + editorial);
	}
}