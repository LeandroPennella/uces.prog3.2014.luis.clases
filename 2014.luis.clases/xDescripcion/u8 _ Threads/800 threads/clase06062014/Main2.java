package uces.programacion3.clase06062014;

import java.lang.Thread;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MiThread n1 = new MiThread(1); MiThread n2 = new MiThread(2);
		 * MiThread n3 = new MiThread(3); MiThread n4 = new MiThread(4);
		 * MiThread n5 = new MiThread(5);
		 */

		MiRunnable n1 = new MiRunnable(1);
		MiRunnable n2 = new MiRunnable(2);
		MiRunnable n3 = new MiRunnable(3);
		MiRunnable n4 = new MiRunnable(4);
		MiRunnable n5 = new MiRunnable(5);

		MiThread t1 = new MiThread(n1);
		MiThread t2 = new MiThread(n2);
		MiThread t3 = new MiThread(n3);
		MiThread t4 = new MiThread(n4);
		MiThread t5 = new MiThread(n5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// t1.run();
		// t2.run();
		// t3.run();
		// t4.run();
		// t5.run();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			System.out.println("Exception en main");
		}
		System.out.println("Fin Main");

		// nuevoThread.start();
		/*
		 * nuevoThread.interrupt();
		 */
		/*
		 * try{ nuevoThread.join(); System.out.println("Bloque main"); }catch
		 * (InterruptedException e){ System.out.println("Interrupcion main");
		 * }finally{ System.out.println("Finally Main"); }
		 */

	}
}
