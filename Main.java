import java.util.Scanner;

public class Main {

	// CREO DOS SCANNER ESTATICOS, LISTA DE MEDIO UN CONTADOR Y LISTA DE EDITORIAL
	// QUE DIRECTAMENTE LLENO DE 5 EDITORIALES EN VEZ DE HACERLO EN UN METODO APARTE
	// PARA EXPRERIMENTAL FUNCIONAMIENTO
	public static Scanner sn = new Scanner(System.in);
	public static Scanner st = new Scanner(System.in);
	private static Medio[] medios = new Medio[100];
	private static int contadorMedios = 0;
	private static Editorial[] editoriales = { 
			new Editorial("GramaPola", "Madrid"),
			new Editorial("PlanetaTierra", "Barcelona"), 
			new Editorial("Plancton", "Sevilla"),
			new Editorial("Alfajores", "Valencia"), 
			new Editorial("BMW", "Bilbao") };

	public static void main(String[] args) {

		// UN MENU DESAROLLADO DIRECTAMENTE EN MAIN.

		int opcion;
		do {
			System.out.println("\n1. Agregar Libro");
			System.out.println("2. Agregar Revista");
			System.out.println("3. Mostrar todos los medios");
			System.out.println("4. Mostrar por tipo de medio");
			System.out.println("5. Salir");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				agregarLibro();
				break;
			case 2:
				agregarRevista();
				break;
			case 3:
				listarMedios();
				break;
			case 4:
				listarPorTipo();
				break;
			case 5:
				System.out.println("Adiooooos....");
				break;
			default:
				System.err.println("Opcion no encontrada");
			}
		} while (opcion != 5);
	}

	// METODO MUY SIMPLE PREGUNTAR LOS 4 ATRIBUTOS Y LUEGO OBTENER EL 5º POR METODO
	// DE ELEGIR EDITORIALES POSTERIORMENTE CREAR nUEVO OBJETO DE TIPO lIBRO

	private static void agregarLibro() {
		System.out.print("Titulo: ");
		String titulo = st.nextLine();
		System.out.print("Autor: ");
		String autor = st.nextLine();
		System.out.print("Año de publicación: ");
		int anyo = sn.nextInt();
		System.out.print("Numero de paginas: ");
		int paginas = sn.nextInt();
		Editorial editorial = seleccionarEditorial();

		medios[contadorMedios++] = new Libro(titulo, autor, anyo, editorial, paginas);
		System.out.println("Libro agregado exitosamente.");
	}

	// METODO MUY SIMPLE PREGUNTAR LOS 4 ATRIBUTOS Y LUEGO OBTENER EL 5º POR METODO
	// DE ELEGIR EDITORIALES POSTERIORMENTE CREAR nUEVO OBJETO DE TIPO REVISTA

	private static void agregarRevista() {
		System.out.print("Titulo: ");
		String titulo = st.nextLine();
		System.out.print("Autor: ");
		String autor = st.nextLine();
		System.out.print("Año de publicación: ");
		int anyo = sn.nextInt();
		System.out.print("Numero de edicion: ");
		int edicion = sn.nextInt();
		Editorial editorial = seleccionarEditorial();

		medios[contadorMedios++] = new Revista(titulo, autor, anyo, editorial, edicion);
		System.out.println("Revista agregada exitosamente.");
	}

	// METODO SELECCIONAR EDITORIAL TE DIRA LAS EDITORIALES DISPONIBLES Y GUARDARA
	// SU NUMERO COMO POSICION DE ARRAY DEVOLVIENDO SU NUMERO EN RETURN.

	private static Editorial seleccionarEditorial() {
		System.out.println("Selecciona una editorial:");
		for (int i = 0; i < editoriales.length; i++) {
			System.out.println((i + 1) + ". " + editoriales[i].getNombre());
		}
		int opcion = sn.nextInt();
		sn.nextLine();
		return editoriales[opcion - 1];
	}

	// METODO LSITAR MEDIOS SI CONTADOR DE MEDIOS ENO ESTA EN 0 MOSTRA INFO
	// RECORIENDO ARRAY DE MEDIOS QUE CONTIENE TANTO LIBROS COMO REVISTAS

	private static void listarMedios() {
		if (contadorMedios != 0) {
			for (int i = 0; i < contadorMedios; i++) {
				medios[i].mostrarInfo();
			}
		} else {
			System.out.println("No hay medios registrados.");
		}
	}

	// ESTE METODO PREGUNTARA PRIMERO QUE FILTRO QUIERES APLICAR, SI MOSTRAR SOLO
	// REVISTAS O LIBROS, AQUI NO DESAROLLE NINGUN COMUNICADO POR SI LA LIOSTA ESTE
	// VACIA.

	private static void listarPorTipo() {
		System.out.println("1. Libros");
		System.out.println("2. Revistas");
		System.out.print("Selecciona una opcion: ");
		int tipo = sn.nextInt();
		for (int i = 0; i < contadorMedios; i++) {
			if ((tipo == 1 && medios[i] instanceof Libro) || (tipo == 2 && medios[i] instanceof Revista)) {
				medios[i].mostrarInfo();
			}
		}
	}
}
