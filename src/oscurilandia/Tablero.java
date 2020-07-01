package oscurilandia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


// Clase Tablero

public class Tablero {

	Carro[][] matrizCarros; // Matriz de objetos Carro
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>(); // Arreglo dinamico de objetos huevo
	int h = 0;
	int fila = 0;
	int columna = 0;
	int pos = 0;
	Random r = new Random(); // Objeto random que se utiliza para generar numeros aleatorios

	// Constructor Tablero

	Tablero(int nfilas, int ncolumnas) {

		// Dimensiona la matriz de carros
		matrizCarros = new Carro[nfilas][ncolumnas];
	}

// Metodo Crear Carro (Crea Kromis, Caguanos y Trupallas en la matriz de Carros)
	public void crearCarro() {
	
		
		// Crea las Kromis
		
		for (h = 0; h <= 2; h++) { //Son 3 ciclos dado que en cada ciclo se crean 3 Kromis verticalmente, en total 9
			do {
				fila = r.nextInt(13) + 1; // Se utiliza el objeto Random 'r'
				columna = r.nextInt(13) + 1;
				if (fila < 13) { // La fila debe ser menor a 13 para no salirse de la definicion 15x15
					if ((matrizCarros[fila][columna] == null) && (matrizCarros[fila + 1][columna] == null)
							&& (matrizCarros[fila + 2][columna] == null)) { // Si en ese lugar es null (no hay objetos) entonces se crean las 3 kromis de forma vertical
						matrizCarros[fila][columna] = new Kromi(3, 1999, fila, columna, 1995, "Chevrolet");
						// La siguiente sentencia se utilizo para probar que se estaban ingresando correctamente los objetos en la matriz.
						// ((Kromi)matrizCarros[fila][columna]).getAll();
						matrizCarros[fila + 1][columna] = new Kromi(3, 2000, fila + 1, columna, 1998, "Ford");
						// ((Kromi)matrizCarros[fila+1][columna]).getAll();
						matrizCarros[fila + 2][columna] = new Kromi(3, 2001, fila + 2, columna, 2003, "Mercedes Benz");
						// ((Kromi)matrizCarros[fila+2][columna]).getAll();
						pos = 1;

					}
				}
			} while (pos == 0);
		}


		// Crea los Caguanos
		
		fila = 0;
		columna = 0;
		pos = 0;
		h = 0;

		for (h = 0; h <= 4; h++) { //Son 4 ciclos dado que en cada ciclo se crean 2 Caguanos horizontalmente, en total 8
			fila = r.nextInt(13) + 1;
			columna = r.nextInt(13) + 1;

			do {
				fila = r.nextInt(13) + 1; // Se utiliza el objeto Random 'r'
				columna = r.nextInt(13) + 1;
				if (columna < 14) { // La fila debe ser menor a 14 para no salirse de la definicion 15x15
					if (matrizCarros[fila][columna] == null && matrizCarros[fila][columna + 1] == null) { // Si en ese lugar es null (no hay objetos) entonces se crean los 2 Caguanos de forma horizontal
						matrizCarros[fila][columna] = new Caguano(4, 2000, fila, columna, 30, "Blanco");
						matrizCarros[fila][columna + 1] = new Caguano(5, 2001, fila, columna + 1, 40, "Azul");
						pos = 1;
					}
				}
			} while (pos == 0);
		}

		// Crea las Trupallas
		fila = 0;
		columna = 0;
		pos = 0;
		int conta = 0;
		h = 0;

		for (h = 0; h < 10; h++) { // Son 10 ciclos donde en cada ciclo se crea una Trupalla
			do {
				fila = r.nextInt(13) + 1; // Se utiliza el objeto Random 'r'
				columna = r.nextInt(13) + 1;
				if (fila < 15) { // La fila debe ser menor a 15 para no salirse de la definicion 15x15
					if ((matrizCarros[fila][columna] == null) && (conta <= 10)) { // Si en ese lugar es null (no hay objetos) entonces se crea una Trupalla
						matrizCarros[fila][columna] = new Trupalla(4, 2000, fila, columna, 30, "Eduardo");
						pos = 1;
					}
				}
			} while (pos == 0);
		}
	}

// Metodo Mostrar Matriz
// Verifica cual es el nombre del objeto en cada espacio de la matriz de carros e imprime su nombre (K, C, T, o H).

	public void mostrarMatriz() {
		int x = 0;
		int y = 0;

		for (x = 0; x < matrizCarros.length; x++) {
			System.out.print("[");
			for (y = 0; y < matrizCarros[x].length; y++) {
				if (matrizCarros[x][y] != null) {
					if (matrizCarros[x][y] instanceof oscurilandia.Kromi) {						
						System.out.print(((Kromi)matrizCarros[x][y]).getNombre());
					}
					if (matrizCarros[x][y] instanceof oscurilandia.Caguano) {
						System.out.print(((Caguano)matrizCarros[x][y]).getNombre());
					}
					if (matrizCarros[x][y] instanceof oscurilandia.Trupalla) {
						System.out.print(((Trupalla)matrizCarros[x][y]).getNombre());
					}
					if (matrizCarros[x][y] instanceof oscurilandia.Huevo) {
						System.out.print(((Huevo)matrizCarros[x][y]).getNombre());
					}
				} else {
					System.out.print("-");
				}
				if (y != matrizCarros[x].length - 1)
					System.out.print("] [");
			}
			System.out.println("]");
		}
		calcularPuntaje();
}

// Metodo Lanzar Huevo

	public void lanzarHuevo(int x, int y) {

		int fila = x;
		int columna = y;
	
		if (matrizCarros[fila - 1][columna - 1] != null) {
			if (matrizCarros[fila-1][columna-1] instanceof oscurilandia.Kromi) { //Si la ubicacion en la matriz esta ocupada con un objeto Kromi
				Huevo huevo = new Huevo(fila, columna, 3); // Se crea el objeto huevo con la ubicacion anterior con 3 puntos
				listaHuevos.add(huevo); // Se agrega el objeto a la lista dinamica
				((Kromi) matrizCarros[fila-1][columna-1]).setNombre("H"); // Se cambia el nombre del objeto Kromi "K" a "H" para poder ser representado e impreso en la matriz mas facilmente 
			}
			if (matrizCarros[fila-1][columna-1] instanceof oscurilandia.Caguano) { //Si la ubicacion en la matriz esta ocupada con un objeto Caguano
				Huevo huevo = new Huevo(fila, columna, 2); // Se crea el objeto huevo con la ubicacion anterior con 2 puntos
				listaHuevos.add(huevo); // Se agrega el objeto a la lista dinamica
				((Caguano) matrizCarros[fila-1][columna-1]).setNombre("H"); // Se cambia el nombre del objeto Caguano "C" a "H" para poder ser representado e impreso en la matriz mas facilmente 

			}
			if (matrizCarros[fila-1][columna-1] instanceof oscurilandia.Trupalla) {  //Si la ubicacion en la matriz esta ocupada con un objeto Trupalla
				Huevo huevo = new Huevo(fila, columna, 1);  // Se crea el objeto huevo con la ubicacion anterior con 1 punto
				listaHuevos.add(huevo); // Se agrega el objeto a la lista dinamica
				((Trupalla) matrizCarros[fila-1][columna-1]).setNombre("H"); // Se cambia el nombre del objeto Trupalla "T" a "H" para poder ser representado e impreso en la matriz mas facilmente 
			}

		} else {
			// Sino, crea el objeto Huevo en la matriz de Carros y en la lista dinamica de Huevos
			matrizCarros[fila-1][columna-1] = new Huevo(fila, columna, 0);
			Huevo huevo = new Huevo(fila, columna, 0);
			listaHuevos.add(huevo);

		}
	}
	// Recorre la lista dinamica de Huevos e imprime puntaje
	public void calcularPuntaje() {
		int i = 0;
		int puntaje = 0;
		for (i = 0; i < listaHuevos.size(); i++) {
			puntaje = listaHuevos.get(i).getPuntaje() + puntaje;
		}
		System.out.println("El puntaje total es: " + puntaje);
	}
	


	public static void main(String[] args) {
		
		Tablero tablero = new Tablero(15, 15);
		tablero.crearCarro();
		tablero.mostrarMatriz();
		System.out.println(" ");
		
		// Create objeto Scanner para lecturas
		
		Scanner entrada = new Scanner(System.in);

		// Menu Principal
		System.out.println("**********************************");	
		System.out.println("******* Menu Oscurilandia ********");
		System.out.println("**********************************");
		System.out.println("1 : Lanzar Huevo");
		System.out.println("2 : Calcular Puntaje");
		System.out.println("3 : Mostrar Matriz");
		System.out.println("4 : Salir del juego");
		System.out.println(" ");
		System.out.println("Ingrese opcion del 1 al 3. Para salir ingrese 4.");

		int opcionTeclado = 0;
			
		while (opcionTeclado < 1 && opcionTeclado > 4) {
			System.out.println(" ");
		}

		String param = "S";

		while (param.contentEquals("S")) {
			opcionTeclado = 0;
			try {
				opcionTeclado = entrada.nextInt();
			} catch (InputMismatchException e) {
				opcionTeclado = 4;
				System.out.println(" ");
			}

			switch (opcionTeclado) {

			case 1:
				System.out.println("Lanzar huevos");
				System.out.println(" ");
				System.out.println("Ingrese numero de fila (1 al 15):");
				int filaTeclado = entrada.nextInt();
				System.out.println("Ingrese numero de columna (1 al 15):");
				int columnaTeclado = entrada.nextInt();
				tablero.lanzarHuevo(filaTeclado, columnaTeclado);
				tablero.mostrarMatriz();
				break;

			case 2:
				System.out.println("Calcular Puntaje");
				System.out.println(" ");
				tablero.calcularPuntaje();
				break;

			case 3:
				System.out.println("Mostrar Matriz");
				System.out.println(" ");
				tablero.mostrarMatriz();
				break;
				
			default:
				System.out.println(" ");
				if (opcionTeclado == 4) {
					System.out.println("Adios...");
					param = "N";
				} else {
					System.out.println("Opcion erronea. Ingrese opción válida: ");
					entrada.next();
					param = "S";
				}
				break;
			}

		}
		

	}
}