package uces.programacion3.clase08042014;

import java.text.*;
import java.util.*;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fechaActual = new Date();
		
		SimpleDateFormat formateoFecha = new SimpleDateFormat("dd/MM/YYYY");
		
		String fechaFormateada = formateoFecha.format(fechaActual);
		
		System.out.println("La fecha actual de sistema es: "+ fechaFormateada );
		
		Calendar fechaCalendario = Calendar.getInstance();
		
		System.out.println("Fecha Calendario " + formateoFecha.format(fechaCalendario.getTime()) );
		
		
	}

}
