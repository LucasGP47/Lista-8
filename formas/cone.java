package formas;

public class cone {
	    
		private int raio;
		private int geratriz;
		private int tipo;
		
	    public cone(int raio, int geratriz, int tipo) {
	    
	    	this.raio = raio;
	    	this.geratriz = geratriz;
	    	this.tipo = tipo;
	    	
	    }
	    
	    public int getraio() {
			return raio;
		}
		public void setraio(Integer raio) {
			this.raio = raio;
		}
		public int getgeratriz() {
			return geratriz;
		}
		public void setgeratriz(int geratriz) {
			this.geratriz = geratriz;
		}
		

	    public static float Calcularaio(int raio, int geratriz) {
	    	
	      float total = (float) (3.14 * raio *(raio + geratriz));
	    	
	       return total;
	    	
	    }
	    
	    
	    public static float geratrizimento(int raio, int geratriz) {
	    	
	    	float total = (float) ((float) Calcularaio(raio, geratriz) / 3.45 / 18);
	    	
	    	if (total % 1 != 0) {
	    		total = (int) total + 1;
	    	}
	    		
	    	
	    	return total;
	    }
	    
	    public static float litros(int raio, int geratriz) {
	    	
	    	float total = (float) (Calcularaio(raio, geratriz) / 3.45);
	    	
	    	return total;
	    }
	    
	    public static float preço(int raio, int geratriz, int tipo) {
	    	
	    	float total = 0;
	    	
	    	if (tipo == 1) {
	    		
	    	total = (float) (geratrizimento(raio, geratriz) * 238.90);
	    		
	    	}
	    	
	    	if (tipo == 2) {
	    		
	    		total = (float) (geratrizimento(raio, geratriz) * 467.98);
	    		
	    	}
	    	
	    	if (tipo == 3) {
	    		
	    		total = (float) (geratrizimento(raio, geratriz) * 758.34);
	    		
	    	}
	    	
	    	return total;
	    }
	    
	    
	    public String toString() {
	    	
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("Area a ser pintada: ");
			stringBuffer.append(Calcularaio(raio, geratriz));
			stringBuffer.append(". Latas de tinta necessárias: ");
			stringBuffer.append(geratrizimento(raio, geratriz));
			stringBuffer.append(". Litros necessários: ");
			stringBuffer.append(litros(raio, geratriz));
			stringBuffer.append(". Valor total: ");
			stringBuffer.append(preço(raio, geratriz, tipo));

			return stringBuffer.toString();
		}
	    
	    
	    
	    
	    
	    
	}


