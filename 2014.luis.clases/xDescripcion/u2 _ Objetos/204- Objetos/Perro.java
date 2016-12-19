package uces.programacion3.ejercicio24;

public class Perro extends Animal{
	private String raza;
	public void setRaza(String value){this.raza=value;}
	public String getRaza(){return this.raza;}
	public Perro(String nomb, String raz) {
		super(nomb);
		this.raza=raz;
	}
	public void imprimirPerro()
	{
		this.imprimirAnimal();
		System.out.println("La raza del perro es: "+this.getRaza());
	}
}
