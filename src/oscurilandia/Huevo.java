package oscurilandia;

public class Huevo extends Carro{

	int ubicFila;
	int ubicColumna;
	int puntaje;
	String nombre;
	

	public Huevo() {
	}
	
	
	public Huevo(int ubicFila, int ubicColumna, int puntaje){ 
		super();
		this.ubicFila = ubicFila;
		this.ubicColumna = ubicColumna;
		this.puntaje = puntaje;
		this.nombre = "H";
	}
	
	public int getubicFila() {
		return ubicFila;
	}
	
	public int getubicColumna() {
		return ubicColumna;
	}
	
	public int getPuntaje() {
		return puntaje;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
