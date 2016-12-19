package uces.programacion3.lbravo;

public class Mujer extends Persona {
	public Mujer(){
		
	}
	public Mujer(int x)

	{
		super(x);
	}
	@Override
	public void decirEdad(){
		System.out.println("Esta es la edad de una mujer: " + (this.edad-3));		
	}
}









