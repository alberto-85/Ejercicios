package Unidad4;
import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner entrada=new Scanner(System.in);
	
	int anyoNacimiento;
	int residuo;
	System.out.println("Escribe tu año de nacimiento");
	anyoNacimiento=entrada.nextInt();
	residuo=anyoNacimiento%12;
		switch(residuo) {
			case 0:System.out.println("Mono");
			break;
			case 1:System.out.println("Gallo");
			break;
			case 2:System.out.println("perro");	
			break;	
			case 3:System.out.println("Cerdo");
			break;
			case 4:System.out.println("Rata");
			break;
			case 5:System.out.println("Buey");
			break;
			case 6:System.out.println("Tigre");
			break;
			case 7:System.out.println("Conejo");
			break;
			case 8:System.out.println("Dragon");
			break;
			case 9:System.out.println("Seepiente");
			break;
			case 10:System.out.println("Caballo");
			break;
			case 11:System.out.println("Oveja");
			break;
			}
	
	}
	
}
