package oscurilandia;

//Clase Kromi hija de clase Carro
public class Kromi extends Carro {
	int agno;
	String marca;
	String nombre; // Se agrega tambien este atributo para que sea representado en la matriz como "K"

	
//Constructor sin parametros	
	public Kromi() {
	}
	
//Constructor con parametros requeridos	
	public Kromi(int cantOcupantes, int fechaIngreso, int ubicFila, int ubicColumna, int agno, String marca) {
		super(cantOcupantes, fechaIngreso, ubicFila, ubicColumna); //llama al constructor de la clase Carro pasando los parametros requeridos 
		this.nombre = "K";
		this.agno = agno;
		this.marca = marca;
		
	}
//Metodo Get obtener año fabricacion
	public int getAgno() {
		return agno;
	}

//Metodo Get obtener marca 
	
	public String getMarca() {
		return marca;
		
	}
	
//Metodo Get obtener nombre
	public String getNombre() {
		return nombre;
		
	}

//Metodo Get setear nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//Metodo Get imprimir todos los atributos del objeto
	public void getAll() {
		System.out.println("Tripulacion: " + cantOcupantes);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("Coordenadas: " + ubicFila + "," + ubicColumna);
		System.out.println("Agno: " + agno);
		System.out.println("Marca: " + marca);
	}
	
}
