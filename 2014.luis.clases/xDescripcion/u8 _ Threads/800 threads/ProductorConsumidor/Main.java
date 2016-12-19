package uces.programacion3.ProductorConsumidor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		Productor p1 = new Productor(lista);
		Consumidor c1 = new Consumidor(lista);
		
		p1.start();
		c1.start();
	}

}
