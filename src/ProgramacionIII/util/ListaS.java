package ProgramacionIII.util;

public class ListaS {  
	protected Node primero;
	protected int tama�o;
	
	public ListaS() {
		primero = null;
		tama�o = 0;
	}
	
	public ListaS(int x) {
		primero = null;

		tama�o = 0;
		for (int i = 0; i < x; i++) {
			this.add((i));
		}
	}
	
	public void add(int o) {
		Node n = new Node(o, null);
		n.setSig(primero);
		primero = n;
		tama�o ++;
	}
	
	public void addOrd(int o) { 
		Node n1 = new Node(o, null);
		Node aux = primero;
		Node n = primero;		
				
		if (n == null) {
			primero =n1;
		    tama�o ++;
		}
		else {
			while(o > (int)n.valor() && n.siguiente() != null) {
				aux= n;
				n= n.siguiente();
			} 
			if ((o < (int)n.valor()) ){
				n1.setSig(aux);
				aux=n1;
				tama�o ++;
				}
			else				
			{ 
				if(n.siguiente() == null) {
					n.setSig(n1);
					tama�o ++;
				}
				else {
					aux.setSig(n1);
					n1.setSig(n);
					tama�o ++;
				}
			
			}
	
		}
	
		}
	

	public Object extract() {
		Node tmp = primero;
		primero = primero.siguiente();
		tama�o --;
		return tmp;
	}
	
	public Object AtElement(int pos) {
		int aux = 0;
		Node n = primero;		
		while( (pos > 0 ) && (n != null) && (pos > aux )){ 
			aux++;
			n=n.siguiente();
		}
		if ((pos == aux)&& (n != null))
			return (int)n.valor();
		else
			return -1;
	}
		
	public void imprimirListaSimple() {
		for (int i = 0; i < size(); i++)
				System.out.print(this.AtElement(i)+" -");
		System.out.println();
	}
	

	public boolean isEmpty() {
		return primero == null;
	}
	public int size () {
		return tama�o;
	}

	
	
	public  ListaS armarListaMezcla(ListaS l1, ListaS l2) {
		ListaS l3 = new ListaS();
		
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				if ((int)l1.AtElement(i) == (int)l2.AtElement(j)){
					l3.addOrd((int)l1.AtElement(i));
				}
			}
		}
		return l3;
	}
	

	
}



