package oscurilandia;

public class Trupalla extends Carro {
	int nivelArm;
	String piloto; // Nombre del piloto
	String nombre; // Se agrega tambien este atributo para que sea representado en la matriz como "T"
	
	
	// Constructor sin parametros
	public Trupalla() {
	}
	
	
	// Constructor con parametros definidos
	public Trupalla(int cantOcupantes, int fechaIngreso, int ubicFila, int ubicColumna, int nivelArm, String piloto) {
		super(cantOcupantes, fechaIngreso, ubicFila, ubicColumna);
		this.nombre = "T";
		this.nivelArm = nivelArm;
		this.piloto = piloto;
		
	}
	
	
	// Metodo Get obtener nivel de armadura
	public int getNivelArm() {
		return nivelArm;
	}
	
	// Metodo Get obtener nombre de piloto
	public String getPiloto() {
		return piloto;
		
	}
	
	// Metodo Get obtener nombre de la Trupalla (Se usa para representarla en la matriz)
	public String getNombre() {
		return nombre;
		
	}
	
	// Metodo Set setear nombre de la Trupalla (Se usa para representarla en la matriz) 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodo Get imprimir todos los atributos del objeto
	public void getAll() {
		System.out.println("Tripulacion: " + cantOcupantes);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("Coordenadas: " + ubicFila + "," + ubicColumna);
		System.out.println("Nivel Armadura: " + nivelArm);
		System.out.println("Piloto: " + piloto);
	}
}
