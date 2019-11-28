package Pizza;

public class PruebaPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Pizza p1=new Pizza("familiar","margarita");
        Pizza p2=new Pizza("mediana","cuatro quesos");
        Pizza p3=new Pizza("pequeña","bbq");
        System.out.println(p1.tamaño+p1.tipo);
        System.out.println("Se han pedido"+p1.getEstado());
        System.out.println(p1.pedida); 
        System.out.println(p2.tamaño+p2.tipo);
        System.out.println("Se han pedido"+p2.getEstado());
        System.out.println(p1.pedida + p2.pedida );
        System.out.println(p3.tamaño+p3.tipo);
        System.out.println("Se han pedido"+p3.getEstado());
        System.out.println(totalPedidas);
        
        
        
           
	
		
	
	}
	

}
