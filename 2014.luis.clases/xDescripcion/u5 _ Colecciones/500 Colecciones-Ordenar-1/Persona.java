package uces.programacion3.ordenar;

public class Persona implements Ordenables {
		private int edad;
		public int getEdad(){return this.edad;}
		public void setEdad(int value){this.edad=value;}
		
		Persona(int value){
			edad=value;
		}
		
		public boolean esMenor(Ordenables otro){
			if (this.getEdad() > ((Persona)otro).getEdad())
			{
				return false;
			}
			else
			{
			return true;
			}
		}
}
