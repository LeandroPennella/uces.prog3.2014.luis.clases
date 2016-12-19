package uces.programacion3.ejercicio24;

public class Animal {
	private String nombre;
	public String getNombre(){return this.nombre;}
	public void setNombre(String value){this.nombre=value;}
	public Animal(String value){this.nombre=value;}
	public void imprimirAnimal()
	{
		System.out.println("Nombre del animal: "+this.getNombre());
	}
}
