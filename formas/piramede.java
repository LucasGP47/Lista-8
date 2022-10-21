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
	

    public static float Calculalado(int lado, int altura) {
    	
       float total = (((lado * altura) / 2) * 4);
    	
       return total;
    	
    }
    
    public static float latas(int lado, int altura) {
    	
    	float total = (float) (Calculalado(lado, altura) / 4.76 / 18);
    	
    	if (total % 1 != 0) {
    		total = (int) total + 1;
    	}
    	
    	return total;
    }
    
    public static float preço(int lado, int altura, int tipo) {
    	
    	float total = 0;
    	
    	if (tipo == 1) {
    		
    	total = (float) (latas(lado, altura) * 127.90);
    		
    	}
    	
    	if (tipo == 2) {
    		
    		total = (float) (latas(lado, altura) * 258.98);
    		
    	}
    	
    	if (tipo == 3) {
    		
    		total = (float) (latas(lado, altura) * 344.34);
    		
    	}
    	
    	return total;
    }
    
    
    public String toString() {
    	
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Area a ser pintada: ");
		stringBuffer.append(Calculalado(lado, altura));
		stringBuffer.append(". Latas de tinta necessárias: ");
		stringBuffer.append(latas(lado, altura));
		stringBuffer.append(". Valor total: ");
		stringBuffer.append(preço(lado, altura, tipo));

		return stringBuffer.toString();
	}
    
    
    
    
    
    
}
