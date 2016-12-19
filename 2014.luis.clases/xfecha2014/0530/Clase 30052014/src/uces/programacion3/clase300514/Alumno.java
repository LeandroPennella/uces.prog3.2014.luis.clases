package uces.programacion3.clase300514;

public class Alumno {
	private String nombre;
	private int edad;
	private double promedio;
	public Alumno(String nom, int eda, double promed){
		this.setNombre(nom);
		this.setEdad(eda);
		this.setPromedio(promed);
	}

	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
