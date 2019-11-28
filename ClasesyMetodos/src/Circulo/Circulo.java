package Circulo;

public class Circulo {
	double radio;
	final double PI= Math.PI;




public Circulo(double radio) {
	
	this.radio=radio;
}
	
public Circulo() {
	radio=2;
}	
public double CalcularSuperfice() {
	return radio * radio * Math.PI;
	
	
}







}

