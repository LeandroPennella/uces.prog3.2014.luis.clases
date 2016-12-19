package uces.programacion3.ordenar;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona> {

	@Override
	public int compare(Persona Pepe, Persona Pepa) {
		// TODO Auto-generated method stub
		if(Pepe.equals(Pepa)){return 0;}
		else if (Pepe.getEdad()-Pepa.getEdad()==0){
			return Pepa.getNombre().compareTo(Pepe.getNombre());
		}else{
			return Pepe.getEdad()-Pepa.getEdad();
		}
		
	}

}
