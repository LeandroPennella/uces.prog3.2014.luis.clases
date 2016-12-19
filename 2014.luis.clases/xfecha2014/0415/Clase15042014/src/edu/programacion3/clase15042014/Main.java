package edu.programacion3.clase15042014;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculadora p1 = new Calculadora();
			try{
			System.out.println(p1.dividir("9","*"));
			} catch (MyException e){
				e.printStackTrace();
			}
	}
}
