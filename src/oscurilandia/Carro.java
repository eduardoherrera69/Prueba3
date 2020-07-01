package oscurilandia;

public class Carro {
	
	int cantOcupantes;
	int fechaIngreso;
	int ubicFila;
	int ubicColumna;

	public Carro() {
		
	}
	public void carro() {
		cantOcupantes = 0;
		fechaIngreso = 0;
		ubicFila = 0;
		ubicColumna = 0;
		
	}

	public Carro(int cantOcupantes, int fechaIngreso, int ubicFila, int ubicColumna) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicFila = ubicFila;
		this.ubicColumna = ubicColumna;
		
	}
	
	public int getCantOcupantes() {
		return cantOcupantes;
		
	}
	public int getfechaIngreso() {
			return fechaIngreso;	
	}
	
	public int getubicFila() {
		return ubicFila;
	
	}
	
	public int getubicColumna() {
		return ubicColumna;
	
	}

	public void getAll() {
		System.out.println("Tripulacion: " + cantOcupantes);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("Coordenadas: " + ubicFila + "," + ubicColumna);
	}
	
	
	
	
	
	public static void main(String[] args) {	
			
	}

}
