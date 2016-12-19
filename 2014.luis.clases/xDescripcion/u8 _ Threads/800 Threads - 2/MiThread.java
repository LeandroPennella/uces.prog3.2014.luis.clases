package uces.programacion3.clase06062014;

import java.lang.Thread;

public class MiThread extends Thread {
	public void runa(){
		try{
			int i = 10;
			while (i>1){
				System.out.println("Thread nº: " + this.identificador);
				Thread.sleep(1);
				i--;
			}
		}catch (InterruptedException e){
			System.out.println("Interrumpido Thread nº:" + this.identificador);
		}finally{
			System.out.println("Fin thread" + Thread.currentThread().toString());
		}				
	}
	private int identificador;
	public MiThread(int numero){
		this.setIdentificador(numero);
	}
	public MiThread(MiRunnable n1) {
		// TODO Auto-generated constructor stub
		super(n1);
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}
