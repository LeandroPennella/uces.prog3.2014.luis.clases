package uces.programacion3.lbravo;

public abstract class Persona {
	
	//Atributos
	protected int edad;
	
	//Metodos
	public abstract void decirEdad();
	//Constructores
	public Persona(){
		
	}
	public Persona(int x){
		this.edad=x;
	}

}
