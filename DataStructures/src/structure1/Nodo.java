package structure1;

public class Nodo {
	private Nodo nextNodo;
	private Nodo prevNodo;
	private Element elem;
	
	// Constructor por defecto
	public Nodo(){
		this.elem = new Element("");
		this.nextNodo = null;
		this.prevNodo = null;
	}
	
	// Constructor con solo elemento
	public Nodo(String elem){
		this.elem = new Element(elem);
		this.nextNodo = null;
		this.prevNodo = null;
	}
	
	public Nodo(String elem, int prioridad){
		this.elem = new Element(elem, prioridad);
		this.nextNodo = null;
		this.prevNodo = null;
	}
	
	public void setPrevNodo(Nodo prevNodo){
		this.prevNodo = prevNodo;
	}
	
	public Nodo getPrevNodo(){
		return this.prevNodo;
	}
	
	public void setNextNodo(Nodo nextNodo){
		this.nextNodo = nextNodo;
	}

	public Nodo getNextNodo(){
		return this.nextNodo;
	}
	
	public Element getElem(){
		return this.elem;
	}
	
	public String toString(){
		String cadena = ("");
		//if (this.prevNodo != null){
		//	cadena += ("Nodo previo: " + this.prevNodo.getElem().toString() + "\n");
		//} 
		//else {
		//	cadena += ("Nodo previo: NULL\n");
		//}
		cadena += ("Actual: " + this.getElem().toString() + "\n");
		
		//if (this.nextNodo != null){
		//	cadena += ("Nodo siguiente: " + this.nextNodo.getElem().toString() + "\n");
		//} 
		//else {
		//	cadena += ("Nodo siguiente: NULL\n");
		//}
		return cadena;
	}
}
