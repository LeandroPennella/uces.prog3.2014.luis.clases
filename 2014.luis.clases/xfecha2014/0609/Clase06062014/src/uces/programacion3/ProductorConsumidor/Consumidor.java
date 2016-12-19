package uces.programacion3.ProductorConsumidor;

import java.util.List;

public class Consumidor extends Thread {
	private List<Integer> items;
	private static final int TOTAL = 1000000000;

	public void run() {
		for (int i = 0; i < Consumidor.TOTAL; i++) {
			try {
				synchronized (items) {
					while (items.size() <= 0) {
						items.wait();
					}
					System.out.println("Consumido: "+items.remove(0));
					items.notifyAll();

				}
			} catch (InterruptedException e) {
				System.out.println("Interrumpieron al consumidor");
			}

		}
		
	}

	public Consumidor(List<Integer> lista) {
		this.items = lista;
	}
}
