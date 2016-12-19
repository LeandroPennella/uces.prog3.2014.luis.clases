package uces.programacion3.ejercicio25;

public class Perro {
	private String raza;
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {

		this.raza = raza;
	}
	
	public Perro(String value){
		///TODO Debe modificar para que la primer letra sea mayuscula
		String primerLetra = value.substring(0, 1);
		
		String stringFinal = value.substring(1);
		
		primerLetra=primerLetra.toUpperCase();
		this.raza=primerLetra.concat(stringFinal);
	}
	public Perro(){
		///TODO Debe llamar al constructor anterior con el string "callejero".
		this("callejero");
	}
}
