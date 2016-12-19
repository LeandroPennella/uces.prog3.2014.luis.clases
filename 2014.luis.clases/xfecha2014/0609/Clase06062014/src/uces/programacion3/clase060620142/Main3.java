package uces.programacion3.clase060620142;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiRunnable r1 = new MiRunnable();
		MiRunnable r2 = new MiRunnable();
		MiRunnable r3 = new MiRunnable();
		MiRunnable r4 = new MiRunnable();
		MiRunnable r5 = new MiRunnable();
		int acumulador=0;
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		try{
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();		

			Thread.sleep(15);
			
			t1.interrupt();
			t2.interrupt();
			t3.interrupt();
			t4.interrupt();
			t5.interrupt();
			//t1.join();
			//t2.join();
			//t3.join();
			//t4.join();
			//t5.join();
			acumulador+=r1.getContador()+r2.getContador()+r3.getContador()+r4.getContador()+r5.getContador();
			
		}catch (InterruptedException e){
			System.out.println("Interrumpido el main");
		}
		System.out.println("Acumulado: "+acumulador);
		System.out.println("runnable1 "+r1.getContador());
		System.out.println("runnable2 "+r2.getContador());
		System.out.println("runnable3 "+r3.getContador());
		System.out.println("runnable4 "+r4.getContador());
		System.out.println("runnable5 "+r5.getContador());
	}
}
