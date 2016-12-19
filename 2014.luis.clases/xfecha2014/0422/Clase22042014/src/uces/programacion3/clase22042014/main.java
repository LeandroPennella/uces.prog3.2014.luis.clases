package uces.programacion3.clase22042014;

import uces.programacion3.clase22042014.Perro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Perro p = new Perro("Pepa",3,"Doberman");
			Perro j = new Perro("Pep",3,"Doberman");
			Perro l = new Perro("Pepa",3,"Doberma");
			Perro d = new Perro("Pepa",3,"Doberman");
			System.out.println(p.hashCode());
			System.out.println(j.hashCode());
			System.out.println(l.hashCode());
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(p.equals(d));
			System.out.println(j.compareTo(p));
	}

}
