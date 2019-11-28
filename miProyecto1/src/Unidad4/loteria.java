package Unidad4;
import  java.util.Scanner;
public class loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner entrada=new Scanner(System.in);
	//vamos a asignar variables a los numeros del usuario
		
		int num1;
		int num2;
		int loteria1=(int)(Math.random()*9+1);
		int loteria2=(int)(Math.random()*9+1);
		
	//pedimos al usuario q introduzca sus números
		System.out.println("Introduce un número del 1 al 9");
		num1=entrada.nextInt();
		System.out.println("Introduce  un número del 1 al 9");
		num2=entrada.nextInt();
	//generamos numeros aleatorios
		System.out.printf("El primer numero ganador es : %f\n",Math.floor(Math.random()*9+1));
		System.out.printf("El segundo numero ganador es : %f\n",Math.floor(Math.random()*9+1));
	//escribimos los casos
		if(num1==loteria1 && num2==loteria2) {
			
			System.out.println("Enhorabuena¡¡¡ has ganado 100000€\n");
			}
		else {System.out.println("No has ganado el 1º premio");
			}
		
		//2 caso
		if(num1==loteria1 ^ num1==loteria2 ^ num2==loteria1 ^ num2==loteria2) {
		}
		else {
			System.out.println("No tienes el 2º premio");
		}
		
		//ultimo caso
		if(num1==loteria1 || num1==loteria2 || num2==loteria1 || num2==loteria2) {
			System.out.println("Enhorabuena..Has ganado 3000€");
			}
		else{ System.out.println("Prueba suerte otra vez");
		}
		
		
		
		
		
		
	}

}
