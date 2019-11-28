package Unidad4;
import java.util.Scanner;
public class ejercicio4

{
	public static void main(String [] args) 
	{
	
	 Scanner entrada=new Scanner(System.in);
	 
	 int num1;
	 double salario; 
	 	System.out.println("Escribe tu salario");
	 	salario=entrada.nextDouble();
		System.out.println("0 = SOLTER@\n 1 = RECIEN CASAD@ O VIUDO@\n 2 = CASAD@\n 3 = CABEZA DE FAMILIA");
		num1=entrada.nextInt();
		
		
			switch(num1) {
				
				case 0:
				if(salario<=8350) 
				System.out.printf("Tu salario es: %f",salario * 0.90);
				else if(salario>=8351 && salario<=33950)
				System.out.printf("Tu salario es: %f",salario * 0.85);
				else if(salario >=33951 && salario<=82250)
				System.out.printf("Tu salario es: %f",salario * 0.75);
				else if(salario >=82251 && salario<=171550)
				System.out.printf("Tu salario es: %f",salario *0.72);
				else if(salario >=171551 && salario<=372950)
				System.out.printf("Tu salario es : %f",salario * 0.67);
				else if(salario >=372951)
				System.out.printf("Tu salario es: %f",salario * 0.65);
				break;	
				
				
				
				case 1:	
				if(salario<=16700) 
				System.out.printf("Tu salario es: %f",salario * 0.90);
				else if(salario>=16781 && salario<=67900)
				System.out.printf("Tu salario es: %f",salario * 0.85);
				else if(salario >=67901 && salario<=137050)
				System.out.printf("Tu salario es: %f",salario * 0.75);
				else if(salario >=137051 && salario<=208850)
				System.out.printf("Tu salario es: %f",salario *0.72);
				else if(salario >=208851 && salario<=372950)
				System.out.printf("Tu salario es : %f",salario * 0.67);
				else if(salario >=372951)
				System.out.printf("Tu salario es: %f",salario * 0.65);
				break;
				
				
				case 2:
				if(salario<=8350) 
				System.out.printf("Tu salario es: %f",salario * 0.90);
				else if(salario>=8351 && salario<=33950)
				System.out.printf("Tu salario es: %f",salario * 0.85);
				else if(salario >=33951 && salario<=68525)
				System.out.printf("Tu salario es: %f",salario * 0.75);
				else if(salario >=68526 && salario<=104425)
				System.out.printf("Tu salario es: %f",salario *0.72);
				else if(salario >=104426 && salario<=186475)
				System.out.printf("Tu salario es : %f",salario * 0.67);
				else if(salario >=18476)
				System.out.printf("Tu salario es: %f",salario * 0.65);
				break;	
					


				case 3:
				if(salario<=11950) 
				System.out.printf("Tu salario es: %f",salario * 0.90);
				else if(salario>=11951 && salario<=45500)
				System.out.printf("Tu salario es: %f",salario * 0.85);
				else if(salario >=45501 && salario<=117450)
				System.out.printf("Tu salario es: %f",salario * 0.75);
				else if(salario >=117451 && salario<=190200)
				System.out.printf("Tu salario es: %f",salario *0.72);
				else if(salario >=190201 && salario<=372950)
				System.out.printf("Tu salario es : %f",salario * 0.67);
				else if(salario >=372951)
				System.out.printf("Tu salario es: %f",salario * 0.65);
				break;	
				default:System.out.println("datos erroneos"); 
				}
	}
		}
