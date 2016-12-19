package uces.programacion3.lbravo;

public class Circulo {
	private double radio;
	static double pi;
	//Metodos
	public Circulo(double rad){
		this.radio=rad;
	}
	public double calcularSuperficie(){
		return Circulo.pi*(this.radio*this.radio);
	}
	public static void cambiarPi(double pi){
		Circulo.pi=pi;
	}
	public void decirSuperficie(){
		System.out.println("La superficie es: " + this.calcularSuperficie());
	}
}
