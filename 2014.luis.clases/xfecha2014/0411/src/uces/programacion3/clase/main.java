package uces.programacion3.clase;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona a = new Persona("Jorge","Alvarez",15);
		Persona b = new Persona("Pepe","Sapo",22);
		
		System.out.println(a.toString());
		System.out.println(a.getEdad()+" "+a.getNombre());
		System.out.println(b.toString());
		System.out.println(b.getEdad()+" "+b.getNombre());
		System.out.println(new Persona("Marta","Perez",45));
		
		/*for (int i = 0; i < 1000000; i++) {
			new Persona("Jorge","Perez",90);
		}
		*/
		
		
	}

}
