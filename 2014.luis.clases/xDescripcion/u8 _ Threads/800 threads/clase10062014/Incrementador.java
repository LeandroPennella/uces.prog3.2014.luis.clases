package uces.programacion3.clase10062014;

public class Incrementador implements Runnable {
	private Contador contador;

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				
					this.contador.incrementar();

				
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void incrementar(Contador c) {
		c.incrementar();
	}

	public Incrementador(Contador c) {
		this.contador = c;
	}

}
