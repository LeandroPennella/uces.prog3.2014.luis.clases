package uces.programacion3.clase10062014;

public class Main4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Contador c1 = new Contador();
	
	Incrementador r1 = new Incrementador(c1);
	Thread t1= new Thread(r1);
	Thread t2= new Thread(r1);
	Thread t3= new Thread(r1);
	Thread t4= new Thread(r1);
	Thread t5= new Thread(r1);
		
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	t5.join();
	
	System.out.println(c1.dameActual());
	}
}
