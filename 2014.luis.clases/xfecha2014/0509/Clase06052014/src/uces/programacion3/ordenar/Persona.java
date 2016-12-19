package uces.programacion3.ordenar;

public class Persona implements Comparable<Persona> {
		private int edad;
		public int getEdad(){return this.edad;}
		public void setEdad(int value){this.edad=value;}
		private String nombre;
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + edad;
			result = prime * result
					+ ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			if (edad != other.edad)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Persona(int value){
			edad=value;
		}
		
		public Persona(int value, String value2){
			this.nombre=value2;
			this.edad=value;
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
		@Override
		public int compareTo(Persona arg0) {
			
			if (this.equals(arg0))
			{
				if(this.getEdad()-arg0.getEdad()!=0)
				{
					return this.getNombre().compareTo(arg0.getNombre());
				}
				return this.getEdad()-arg0.getEdad();
			}
			return 0;
		}
}
