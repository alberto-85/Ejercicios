package unidad4;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in);
		
		int num1;
		final int num2;
		final int num3;
		
		num2=2;
		num3=3;
		
		System.out.println("Introduce el numero que quieras saber");
		num1=entrada.nextInt();
		
		if(num1%num2==0){
			System.out.println("Es divisble por 2");
			}
		else {
			System.out.println("No es divisible por 2 y por 3 a la vez");
		}
			
		
	}

}
