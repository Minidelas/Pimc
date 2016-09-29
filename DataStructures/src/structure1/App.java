package structure1;

import javax.swing.*;

@SuppressWarnings("serial")
public class App extends JFrame{
	public static void main (String [] args){
		App  ventana = new App();
		ventana.setBounds(500, 500, 500, 500);
		ventana.setVisible(true);
		ventana.setResizable(false);
	}
	
	/**
	Cola c1 = new Cola();
	
	Nodo n1 = new Nodo("Muñoz", 2);
	Nodo n2 = new Nodo("Ismael", 3);
	
	Nodo n3 = new Nodo("Candelas", 1);
	
	c1.addNodo(n1);
	c1.addNodo(n2);
	
	n2 = new Nodo("ism", 3);
	
	c1.addNodo(n2);
	
	c1.deleteNodo();
	
	c1.addNodo(n3);
	
	System.out.println("Número de nodos: " + c1.getNumNodos());
	System.out.println("Numero de elementos creados: " + Element.getContador());
	System.out.println();
	System.out.println("Recorremos cola:");
	c1.recorrer();
	*/
	
	private App(){
		setLayout(null);
		JButton b1 = new JButton("Hola");
		b1.setBounds(100, 100, 50, 80);
		add(b1);
	}
}
