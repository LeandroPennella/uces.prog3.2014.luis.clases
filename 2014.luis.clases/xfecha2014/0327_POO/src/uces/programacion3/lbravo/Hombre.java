package uces.programacion3.lbravo;

public class Hombre extends Persona {
	public Hombre(){
		
	}
	public Hombre(int x){
		super(x);
	}
	
	public void decirEdad(){
		System.out.println("La edad del hombre es: "+this.edad);
	}
}
