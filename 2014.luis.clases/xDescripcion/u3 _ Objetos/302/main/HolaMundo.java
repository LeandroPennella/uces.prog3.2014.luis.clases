package uces.programacion3.main;


import uces.programacion3.lbravo.*;

public class HolaMundo {

	public static void main(String[] args) {
			/*
			Saludador pepito=new Saludador();
			pepito.setSaludar("Jose");
			pepito.saludar();
			
			Saludador pedro = new Saludador();
			pedro.setSaludar(pepito.getSaludar()+pepito.getSaludar());
			pedro.saludar();
			pedro.setSaludar(pepito.toString());
			*/
			/*
			Saludador pepe = new Saludador();
			pepe.saludar();
			*/
			Mujer josefa = new Mujer(20);
			josefa.decirEdad();
			Hombre pepe = new Hombre(48);
			pepe.decirEdad();
			
			
			Persona[] p = new Persona[2];
			p[0] = new Hombre(20);
			p[1] = new Mujer(20);
			
			for (int j = 0; j < p.length; j++) {
				p[j].decirEdad();
			}
			
			Circulo c1 = new Circulo(2);
			c1.decirSuperficie();
			Circulo.cambiarPi(3.14);
			c1.decirSuperficie();
	}
}
