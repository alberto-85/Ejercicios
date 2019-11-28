public class Test{
	public static void main(String[]args){
	java.util.Scanner input=new java.util.Scanner(System.in);
	
	x=2.y=3,z=6;
	
	double x= input.nextDouble();
	double y= input.nextDouble(); 
	double z= input.nextDouble();
	System.out.println("(x < y && y < z)is " + (x < y && y < z));
	System.out.println("(x < y || y < z)is " + (x < y || y < z));
	System.out.println("!(x < y) is" +( x + y < z));
	System.out.println("(x + y < z) is " + ( x+ y < z));
	System.out.println("(x + y > z) is " + (x + y > z));
	}
	
}
