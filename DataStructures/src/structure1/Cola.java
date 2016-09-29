package structure1;

public class Cola {
	private Nodo inicio;
	private int numNodos;
	
	public Cola(){
		this.inicio = null;
		this.numNodos = 0;
	}
	
	public Cola(Nodo nodo){
		this.inicio = nodo;
		this.numNodos = 1;
	}
	
	public void addNodo(Nodo nuevoNodo){
		if (this.inicio == null){
			this.inicio = nuevoNodo;
			this.numNodos++;
		} else {
			Nodo ultimo = getLastNodo(this.inicio);
			addNodoParcial(nuevoNodo, ultimo);
		}
	}
	
	public void addNodoParcial(Nodo nuevoNodo, Nodo nodoAux){
		if(nuevoNodo.getElem().getPrioridad() <= nodoAux.getElem().getPrioridad()){
			
			Nodo nodoTemp = nodoAux.getNextNodo();
			
			nodoAux.setNextNodo(nuevoNodo);
			nuevoNodo.setPrevNodo(nodoAux);
			nuevoNodo.setNextNodo(nodoTemp);
			this.numNodos++;
			
		} else {
			
			if(nodoAux.getPrevNodo() != null){
				addNodoParcial(nuevoNodo, nodoAux.getPrevNodo());
			} else {
				Nodo nodoTemp = this.inicio;
				nodoTemp.setPrevNodo(nuevoNodo);
				this.inicio = nuevoNodo;
				nuevoNodo.setNextNodo(nodoTemp);
				this.numNodos++;
			}
			
		}
	}
	
	public void deleteNodo(){
		this.inicio = this.inicio.getNextNodo();
		this.inicio.setPrevNodo(null);
		this.numNodos--;
	}
	
	public void recorrer(){
		Nodo nodoAux = this.inicio;
		while(nodoAux != null){
			System.out.println(nodoAux);
			nodoAux = nodoAux.getNextNodo();
		}
	} 
	
	public Nodo getLastNodo(Nodo nodoActual){
		Nodo aux;
		if(nodoActual.getNextNodo() != null){
			aux = getLastNodo(nodoActual.getNextNodo());
		} else {
			aux = nodoActual;
		}
		return aux;
	}
	
	public Nodo getLastNodo(){
		return getLastNodo(this.inicio);
	}
	
	public int getNumNodos(){
		return this.numNodos;
	}
}
