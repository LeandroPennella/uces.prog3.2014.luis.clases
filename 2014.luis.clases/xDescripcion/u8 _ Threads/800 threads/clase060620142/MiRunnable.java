package uces.programacion3.clase060620142;

public class MiRunnable implements Runnable {
	private int contador;
	@Override
	public void run() {
		/*try{
			while(true){
				contador++;
				//Thread.sleep(1);
			}	
		}catch(InterruptedException e){
			System.out.println("Thread Interrumpido");
		}*/
		/*while (true){
			this.contador++;
		}*/
		for (int i = 0; i < 100; i++) {
			int x = contador;
			x=x+1;
			contador=x;
		
		}		
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}

}
