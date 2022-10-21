package formas;

public class cubo {
    
	private int area;
	private int rend;
	private int tipo;
	
    public cubo(int area, int rend, int tipo) {
    
    	this.area = area;
    	this.rend = rend;
    	this.tipo = tipo;
    	
    }
    
    public int getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public int getRend() {
		return rend;
	}
	public void setRend(int rend) {
		this.rend = rend;
	}
	

    public static int CalculaArea(int area) {
    	
       int total = (area * area);
    	
       return total;
    	
    }
    
    
    public static float rendimento(int area, int rend) {
    	
    	float total = (float) CalculaArea(area) / rend / 18;
    	
    	if (total % 1 != 0) {
    		total = (int) total + 1;
    	}
    		
    	
    	return total;
    }
    
    public static float litros(int area, int rend) {
    	
    	float total = (CalculaArea(area) / rend);
    	
    	return total;
    }
    
    public static float preço(int area, int rend, int tipo) {
    	
    	float total = 0;
    	
    	if (tipo == 1) {
    		
    	total = (float) (rendimento(area, rend) * 101.90);
    		
    	}
    	
    	if (tipo == 2) {
    		
    		total = (float) (rendimento(area, rend) * 212.45);
    		
    	}
    	
    	if (tipo == 3) {
    		
    		total = (float) (rendimento(area, rend) * 345.56);
    		
    	}
    	
    	return total;
    }
    
    
    public String toString() {
    	
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Area a ser pintada: ");
		stringBuffer.append(CalculaArea(area));
		stringBuffer.append(". Latas de tinta necessárias: ");
		stringBuffer.append(rendimento(area, rend));
		stringBuffer.append(". Litros necessários: ");
		stringBuffer.append(litros(area, rend));
		stringBuffer.append(". Valor total: ");
		stringBuffer.append(preço(area, rend, tipo));

		return stringBuffer.toString();
		
		
	}
    
 
    
}
