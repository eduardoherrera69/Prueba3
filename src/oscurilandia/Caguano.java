package oscurilandia;

// Clase Caguano hija de clase Carro
public class Caguano extends Carro {
	int alcance;
	String color;
	String nombre; // Se agrega tambien este atributo para que sea representado en la matriz como "C"
	
	
	// Constructor sin parametros
	public Caguano() {
	}
	
	
	// Constructor con parametros requeridos
	public Caguano(int cantOcupantes, int fechaIngreso, int ubicFila, int ubicColumna, int alcance, String color) {
		super(cantOcupantes, fechaIngreso, ubicFila, ubicColumna); // llama al constructor de la clase padre Carro y le pasa los parametros requeridos
		this.nombre = "C";
		this.alcance = alcance;
		this.color = color;
		
	}

	// Metodo Get obtener alcance
	public int getAlcance() {
		return alcance;
	}
	
	// Metodo get obtener color de confeti
	public String getColor() {
		return color;
		
	}
	
	// Metodo Get obtener nombre
	public String getNombre() {
		return nombre;
		
	}
	
	
	// Metodo Get setear nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodo Get imprimir todos los atributos del objeto
	public void getAll() {
		System.out.println("Tripulacion: " + cantOcupantes);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("Coordenadas: " + ubicFila + "," + ubicColumna);
		System.out.println("Alcance: " + alcance);
		System.out.println("Color: " + color);
	}
	
}
