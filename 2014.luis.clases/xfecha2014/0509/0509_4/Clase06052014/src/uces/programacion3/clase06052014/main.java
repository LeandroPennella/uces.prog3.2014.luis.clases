package uces.programacion3.clase06052014;


import uces.programacion3.ordenar.*;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Collection<Persona> c=new TreeSet<Persona>(new ComparadorPersonas());
		c.add(new Persona(5,"Marta"));
		c.add(new Persona(10,"Marta"));
		c.add(new Persona(10,"Juan"));
		c.add(new Persona(5,"Juan"));
		
		
		
		Iterator<Persona> i = c.iterator();
		
		while(i.hasNext()){
			Persona J = i.next();
			System.out.println(J.getNombre()+"\t\t "+J.getEdad());
		}
		System.out.println("*******************************");
		//Collections.sort(List)
		//Collections.sort(List,Comparator)
		*/
		
		Map<String, Persona> M = new HashMap<String,Persona>();
		
		M.put("Diego", new Persona(24,"Diego"));
		
		Persona J=M.get("Diego");
		System.out.println(J.getNombre());

	}

}
