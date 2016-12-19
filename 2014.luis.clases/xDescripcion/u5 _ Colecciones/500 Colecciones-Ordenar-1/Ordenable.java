package uces.programacion3.ordenar;

public class Ordenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Persona p1 = new Persona(17);
			Persona p2 = new Persona(19);
			Persona p3 = new Persona(12);
			Persona p4 = new Persona(82);
			Persona p5 = new Persona(54);
			Persona p6 = new Persona(63);
			Persona p7 = new Persona(79);
			Persona p8 = new Persona(2);
			
			
			Ordenables[] listuli = new Ordenables[8];
			listuli[0]=p1;
			listuli[1]=p2;
			listuli[2]=p3;
			listuli[3]=p4;
			listuli[4]=p5;
			listuli[5]=p6;
			listuli[6]=p7;
			listuli[7]=p8;
			
			int i=15;
			
			Ordenador Ordeno= new Ordenador();
			
			Ordeno.ordenar(listuli);
			
			for (Ordenables ordenables : listuli) {
				System.out.println("Edad de la persona: "+((Persona)ordenables).getEdad());
			}
	}

}
