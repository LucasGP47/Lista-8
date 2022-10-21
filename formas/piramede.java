package formas;

public class piramede {
    
	private int lado;
	private int altura;
	private int tipo;
	
    public piramede(int lado, int altura, int tipo) {
    
    	this.lado = lado;
    	this.altura = altura;
    	this.tipo = tipo;
    	
    }
    
    public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	

    public static int Calculalado(int lado, int altura) {
    	
       int total = ((lado * altura) / 2) * 4;
    	
       return total;
    	
    }
    
    public static int alturaimento(int lado, int altura) {
    	
    	int total = (int) (Calculalado(lado, altura) / 4.76);
    	
    	return total + 1;
    }
    
    public static float preço(int lado, int altura, int tipo) {
    	
    	float total = 0;
    	
    	if (tipo == 1) {
    		
    	total = (float) (alturaimento(lado, altura) * 127.90);
    		
    	}
    	
    	if (tipo == 2) {
    		
    		total = (float) (alturaimento(lado, altura) * 258.98);
    		
    	}
    	
    	if (tipo == 3) {
    		
    		total = (float) (alturaimento(lado, altura) * 344.34);
    		
    	}
    	
    	return total;
    }
    
    
    public String toString() {
    	
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("lado a ser pintada: ");
		stringBuffer.append(Calculalado(lado, altura));
		stringBuffer.append(". Latas de tinta necessárias: ");
		stringBuffer.append(alturaimento(lado, altura));
		stringBuffer.append(". Valor total: ");
		stringBuffer.append(preço(lado, altura, tipo));

		return stringBuffer.toString();
	}
    
    
    
    
    
    
}
