package formas;
import java.util.Scanner;

public class cubomain {
	
    public static void main(String[] args) {

	
	Scanner entrada = new Scanner (System.in);
	
    System.out.println("Informe o lado do cubo: ");
    
    int area = entrada.nextInt();
    
    System.out.println("Informe o rendimento da tinta: ");
    
    int rend = entrada.nextInt();
    
    System.out.println("Informe o tipo de tinta: ");
    
    int tipo = entrada.nextInt();
    
    cubo teste = new cubo(area, rend, tipo);
    
    System.out.println(teste.toString());
    
	entrada.close();
	
    }
}
