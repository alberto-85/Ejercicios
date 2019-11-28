package Geometria;

public class Geometria {

	static double radio;
	static double altura;
	static double volumen;
	static double circunferencia;
	
	public Geometria() {
		
	}	
	public Geometria(double radio,double altura) {
		this.radio=radio;
		this.altura=altura;
	}
	public  static double retorna_Volumen(double vol,double ra) {
		return Math.PI*Math.pow(radio,2)*altura;
					
	}
	public static  double retorna_Circunferencia(double circun) {
		return circunferencia=circun;
		
	}
	
}
