package excepciones;

public class MiException extends Exception{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public MiException (){}
		public MiException (String mensaje){super(mensaje);}
		public MiException (String mensaje, Throwable trw){super(mensaje,trw);}
		public MiException (Throwable trw){super(trw);}
}
