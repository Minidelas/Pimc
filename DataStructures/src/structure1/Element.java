package structure1;

public class Element {
	
	private String nombre;
	private int prioridad;
	private static int contador = 0;
	
	// Constructores
	public Element(String nombre, int prioridad){
		this.nombre = nombre;
		this.prioridad = prioridad;
		contador++;
	}
	
	public Element(String nombre){
		this.nombre = nombre;
		contador++;
	}
	
	public Element(){
		this.nombre = "";
		this.prioridad = 0;
		contador++;
	}
	///////////////////////////////////////////////
	
	
	public String toString(){
		return this.nombre + " " + this.prioridad;
	}
	
	// getters setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public static int getContador() {
		return contador;
	}
}
