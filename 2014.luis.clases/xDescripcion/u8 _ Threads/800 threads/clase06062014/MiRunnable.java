package uces.programacion3.clase06062014;

public class MiRunnable implements Runnable {

	public MiRunnable(int numero){
		this.identificador=numero;
	}
	private int identificador;
	@Override
	public void run(){
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

}
