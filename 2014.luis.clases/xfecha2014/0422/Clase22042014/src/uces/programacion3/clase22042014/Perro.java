package uces.programacion3.clase22042014;

import java.lang.Comparable;

public class Perro implements Comparable<Perro> {
	private String nombre; 
	private int edad;
	private String raza;
	
	public void setNombre(String value){this.nombre=value;}
	public void setEdad(int value){this.edad=value;}
	public void setRaza(String value){this.raza=value;}
	public String getNombre(){return this.nombre;}
	public int getEdad(){return this.edad;}
	public String getRaza(){return this.raza;}
	
	public Perro(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((raza == null) ? 0 : raza.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Trata de ver si es igual la direccion de memoria
			return true;
		if (obj == null) //Confirma que no es nulo
			return false;
		if (getClass() != obj.getClass()) //Confirma que es de la misma clase
			return false;
		Perro other = (Perro) obj; //Castea a obj como perro
		if (edad != other.edad) //Comienza a pregunar sobre el estado
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (raza == null) {
			if (other.raza != null)
				return false;
		} else if (!raza.equals(other.raza))
			return false;
		return true;
	}
	@Override
	public int compareTo(Perro arg0) {
		/*if (this.equals(arg0)) return 0;
		if (this.edad > arg0.getEdad()) return -1;
		return 1;
		*/
		if (this.nombre.compareTo(arg0.getNombre())==0){
			return ((Integer)this.edad).compareTo(arg0.getEdad());
		}
		return this.nombre.compareTo(arg0.getNombre());
	}
	
	
	
	
}
