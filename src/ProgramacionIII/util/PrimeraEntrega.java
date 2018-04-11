package ProgramacionIII.util;

public class PrimeraEntrega {

	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();


		ListaS l1 = new ListaS();
		ListaS l2 = new ListaS();
		ListaS l3 = new ListaS();

		l1.add(12);
		l1.add(10);
		l1.add(2);
		l1.add(1);
		l1.add(5);


		
		l2.add(1);
		l2.add(5);
		l2.add(8);
		l2.add(4);
		l2.add(12);	
		
		l3 = l3.armarListaMezcla(l1,l2);
		
		l1.imprimirListaSimple();
		l2.imprimirListaSimple();
		l3.imprimirListaSimple();	
		
		System.out.print("Tardo: ");
		System.out.println(t.stop());
	}

}
