package excepciones;

public class Calculadora {
	private int numero1;
	private int numero2;
	
	public int getNumero1(){return this.numero1;}
	public int getNumero2(){return this.numero2;}
	public void setNumero1(int value){this.numero1=value;}
	public void setNumero2(int value){this.numero2=value;}
	
	public int dividir(int a, int b) throws MiException {
		if (a == 0 || b == 0)
		{
			if (a ==0){
			throw new MiException("Division por zero en parametro A");
			}			
			throw new MiException("Division por zero en parametro B");	
		}		
		return a/b;
	}
}
