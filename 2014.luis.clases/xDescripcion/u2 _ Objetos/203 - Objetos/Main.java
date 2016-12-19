package uces.programacion3.ejercicio23;

import java.util.Calendar;
import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR,2000);
		c1.set(Calendar.DAY_OF_YEAR,300);
		
		Date fechaDeNacimiento = c1.getTime();
		System.out.println(c1.getTime().toString());
		
		Persona jorge = new Persona("jorge",fechaDeNacimiento);
		Persona lucas = new Persona("Lucas",19);
		System.out.println("La edad de persona es: "+jorge.getEdad());
		System.out.println("El nombre es: "+jorge.getNombre());
		
		System.out.println("La edad de persona es: "+lucas.getEdad());
		System.out.println("El nombre es: "+lucas.getNombre());
	}

}
