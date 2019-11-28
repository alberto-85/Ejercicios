package unidad4;
import java.util.Scanner;
public class ejercicio3
{
	public static void main(String [] args)
	{
	
	
	Scanner entrada= new Scanner(System.in);
	
	int score;
	
	
	System.out.println("Escribe el resultado");
	score=entrada.nextInt();
	
		if(score>=60)
			System.out.println("D");
		else if(score>=70)						
			System.out.println("C");
		else if(score>=80)						
			System.out.println("D");
		else if(score>=90)						
			System.out.println("A");
		else
			System.out.println("F");
	}
	
}
