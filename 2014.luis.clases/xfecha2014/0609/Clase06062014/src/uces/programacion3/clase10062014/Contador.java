package uces.programacion3.clase10062014;

public class Contador {

	private int c;
	public void incrementar(){
		synchronized(this){
			c++;
		}
		//System.out.println(this.dameActual());
		/*
		int x=this.c+1;
		Thread.yield();
		this.c=x;
		*/
	}
	public int dameActual(){
		return this.c;
	}
	

}
