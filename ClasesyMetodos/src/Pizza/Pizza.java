package Pizza;

public class Pizza {

	    String tamaño;
	    String tipo;
	    int pedida = 0;
	    int total=0;
	    
	    
	    public Pizza() {
	    }

	    public Pizza(String tamaño, String tipo) {
	        this.tamaño = tamaño;
	        this.tipo = tipo;
	        pedida++;
	        
	    }

	    public int estado() {
	        this.pedida=pedida++;
	    	return  pedida;

	    }

	    public String getTamaño() {
	        return tamaño;
	    }

	    public void setTamaño(String tamaño) {
	        this.tamaño = tamaño;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

	    public int getEstado() {
	        return pedida;
	    }

	    public void setEstado(int pedida) {
	        this.pedida = pedida;
	    }
	        
		public int total(int total) {
			return this.total=total++;
			
			
	    }
	}

		


