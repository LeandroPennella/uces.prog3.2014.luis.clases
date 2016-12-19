package edu.programacion3.clase15042014;

public class Calculadora {
	public int dividir(String a,String b) throws MyException{
		try{
			int c=Integer.parseInt(a);
			int d=Integer.parseInt(b);
			return this.dividir(c,d);
			
		}catch(NumberFormatException e){
			throw new MyException("No ingreso un numero valido",e);
		}catch(ArithmeticException e){
			throw new MyException("Dividiste por cero",e);
		}catch(IllegalArgumentException e){
			throw new MyException("Argumentos Invalidos",e);
		}
	}
	private int dividir(int a,int b){
		if(a==0||b==0)
		{
			throw new ArithmeticException();
		}
		return a/b;
	}
}
