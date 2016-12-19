package uces.programacion3.ProductorConsumidor;

import java.util.List;
import java.util.Random;

public class Productor extends Thread {
	private List<Integer> items;
	private static final int MAX=10;
	private Random r=new Random();
	private static final int TOTAL=1000000000;
	public void run(){
		try{
			for (int i = 0; i < Productor.TOTAL; i++) {
				int producido = r.nextInt(100);
				synchronized(items){
					while (items.size()>= Productor.MAX) {
						items.wait();
					}
					items.add(producido);
					System.out.println("Producido :"+producido);
					items.notify();
				}
			}
		}catch (InterruptedException e){
			System.out.println("Interrumpieron al productor");
		}
	}
	public Productor(List<Integer> Lista){
		this.items=Lista;
	}

}
