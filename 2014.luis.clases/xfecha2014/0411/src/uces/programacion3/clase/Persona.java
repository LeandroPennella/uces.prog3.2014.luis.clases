package uces.programacion3.clase;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;
	
	public int getEdad(){return this.edad;}
	public void setEdad(int value){this.edad=value;}
	public String getNombre (){return this.nombre;}
	public void setNombre(String value){this.nombre=value;}
	public String getApellido(){return this.apellido;}
	public void setApellido(String value){this.apellido=value;}
	
	public Persona(String a,String b,int x)
	{
		this.nombre=a;
		this.apellido=b;
		this.edad=x;
	}
	@Override
	public String toString()
	{
		return "Clase Persona\nNombre: "+this.nombre +"\nApellido: "+this.apellido+"\nEdad: "+this.edad;
	}
	@Override
	public void finalize()
	{
		System.out.println("FINALIZE LLAMADO GARBAGE COLLECTOR EXISTE!");
	}
}
