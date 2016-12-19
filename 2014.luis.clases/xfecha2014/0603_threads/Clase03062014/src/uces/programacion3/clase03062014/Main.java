package uces.programacion3.clase03062014;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> ps = new ArrayList<Persona>();
		
		ps.add(new Persona("Jorge", "Zabaleta", 59, 7.5));
		ps.add(new Persona("Martin", "Insaurralde", 48, 4.2));
		
		EscritorPersona ep =new EscritorPersona();
		ep.escribir(ps, "pat.txt");
		
		System.out.println(ep.promediar("pat.txt"));
	}

}
