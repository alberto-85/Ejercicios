import java.util.Scanner;
	public class ejercicio6
	{
	public static void main(String []args)
		{
			Scanner entrada=new Scanner(System.in);
		
			int num1;
			final int num2;
			final int num3;
			
			num2=2;
			num3=3;
			
			System.out.println("Introduce el numero que quieras saber");
			num1=entrada.nextInt();
			//caso para la operacion y
			if(num1%num2==0 && num1%num3==0){
				System.out.println("Es divisble por 2 y por 3");
				}
			else{	
				System.out.println("No es divisible por 2 y por 3 a la vez");
				}
			//caso para la operacion or...
				if(num1%num2==0 || num1%num3==0){
					System.out.println("Es divisble por 2 o por 3");
				}
				else{	
					System.out.println("No es divisible ni por 2  ni por 3 ");
				}
				if(num1%num2==0){
					System.out.println("Es divisble por 2");
				}
				else{	
					System.out.println("No es divisible por 2 ");
				}
		
				if(num1%num3==0){
					System.out.println("Es divisible por 3");
				}
				else{	
					System.out.println("No es divisible por 3 ");
				}
		//caso para la operacion orx....
		
				if(num1%num2!=0 ^ num1%num3==0){
					System.out.println("Es divisible por 2 o por 3 ");
				}
				else{	
					System.out.println("No es divisible por los 2 ");
				}
		
					if(num1%num2==0){
					System.out.println("Es divisible por 2 ");
				}
				else{	
					System.out.println("No es divisible por 2");
				}
				if(num1%num3==0){
					System.out.println("Es divisible por 3 ");
				}
				else{	
					System.out.println("No es divisible por 3");
				}
		
				if(num1%num2!=0 && num1%num2!=0){
					System.out.println("No es divisible por ninguno de los 2 ");
				}
				else{	
					
				}
		
		}
		

}
	
