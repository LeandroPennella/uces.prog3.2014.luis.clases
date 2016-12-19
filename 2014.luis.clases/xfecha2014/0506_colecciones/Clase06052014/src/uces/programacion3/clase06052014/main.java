package uces.programacion3.clase06052014;


import uces.programacion3.ordenar.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(new Persona(22,"Diego"));
		c.add(new Persona(22,"Diego"));
		c.add(new Persona(22,"Jorge"));
		c.add(new Persona(22,"Pablo"));
		c.add(new Persona(22,"Luis"));
		c.add(new Persona(22,"Martin"));
		c.add(new Persona(22,"Sabrina"));
		
		
		Iterator i = c.iterator();
		
		while(i.hasNext()){
			System.out.println(((Persona)i.next()).getNombre());
		}
		System.out.println("*******************************");
		c.remove(new Persona(22,"Diego"));
		Iterator i2 = c.iterator();
		while(i2.hasNext()){
			System.out.println(((Persona)i2.next()).getNombre());
		}
		
	}

}
