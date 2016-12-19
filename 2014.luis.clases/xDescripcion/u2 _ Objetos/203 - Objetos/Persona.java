package uces.programacion3.ejercicio23;


import java.util.*;

public class Persona {
	//Atributos
	private String nombre;	
	private int edad;
	
	
	//Constructores
	public Persona(String nom, int ed){
		this.nombre=nom;
		this.edad=ed;
	}
	public Persona(String nom, Date fechaNacimiento) {
		this.nombre=nom;
		/*
		//Formateador de fechas
		SimpleDateFormat formateoFechas = new SimpleDateFormat("dd/MM/yyyy");
		formateoFechas.setLenient(false);
		//Obtener Fecha actual
		Date fechaActual = new Date();
		
		//Verificar si la fecha de entrada es valida
		try {
		String fechaConvertida = formateoFechas.format(fechaNacimiento);
		Date fechaValidada = formateoFechas.parse(fechaConvertida);
		Long diferenciaFechas = fechaActual.getTime() - fechaValidada.getTime();
		Date diferenciaDate = new Date (diferenciaFechas);
		Calendar fecha = Calendar.getInstance();
		fecha.setTime(diferenciaDate);
		this.edad = fecha.YEAR;
		} catch (ParseException e){
			System.out.println("Fecha no valida en calendario");
		}
		System.out.println("la edad del objeto es: " + this.getEdad());
		System.out.println("El nombre del objeto es: " + this.getNombre());
		*/
		
		Calendar fecha1 = Calendar.getInstance();
		fecha1.setTime(fechaNacimiento);
		Calendar fecha2 = Calendar.getInstance();
		Calendar fecha3 = Calendar.getInstance();
		fecha3.set(Calendar.YEAR, fecha2.get(Calendar.YEAR)-fecha1.get(Calendar.YEAR));
		fecha3.set(Calendar.MONTH, fecha2.get(Calendar.MONTH)-fecha1.get(Calendar.MONTH));
		fecha3.set(Calendar.DAY_OF_YEAR, fecha2.get(Calendar.DAY_OF_YEAR)-fecha1.get(Calendar.DAY_OF_YEAR));
		
		this.edad = fecha3.get(Calendar.YEAR);
		
		
		
	}
	//Getters y Setters;
	public int getEdad (){
		return this.edad;
	}
	public String getNombre (){
		return this.nombre;
	}
	public void setEdad (int value){
		this.edad=value;
	}
	public void setNombre (String value){
		this.nombre=value;
	}
}
