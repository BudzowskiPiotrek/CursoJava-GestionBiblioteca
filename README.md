# CursoJava-GestionBiblioteca
 
Desarrolla un sistema para gestionar una biblioteca que contiene diversos
tipos de medios, como Libros y Revistas. Todos los medios tienen atributos
comunes como titulo, autor y añoPublicacion. Los Libros tienen un atributo
adicional numeroPaginas, mientras que las Revistas tienen un atributo
numeroEdicion. Además, cada medio tiene una Editorial con atributos como
nombre y direccion. En nuestra biblioteca solo tenemos ejemplares de 5
editoriales definidas en la clase main, crea un menú que permita dar de alta
nuevos ejemplares, modificarlos, listarlos todos y listarlos permitiendo elegir
el tipo de medio (Libros o Revistas).

¿Que relación tiene Editorial con los tipos de medios?
(ayuda)
El ejercicio anterior plantea una relación de Agregación puesto que la
Editorial puede seguir existiendo al margen del Libro o Revista, es más
es una relación compartida puesto que varios libros pueden tener la
misma editorial.
El enunciado dice que los medios serán Libros o Revistas por lo que no
tienen sentido que la clase Medio sea instanciada en la clase principal,
por ese motivo la declaramos como Abstracta.
Ademas el método mostrarInfor lo declaramos abstracto para que las
subclases lo desarrollen.
Las subclases serán Libro y Revista que heredarán de Medio y además
desarrollan el comportamiento del método mostrarInfo.