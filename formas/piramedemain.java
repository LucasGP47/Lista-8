package formas;
import java.util.Scanner;

public class piramedemain {
	
    public static void main(String[] args) {

	
	Scanner entrada = new Scanner (System.in);
	
    System.out.println("Informe os dados a piramede: ");
    
    int base = entrada.nextInt();
    int altura = entrada.nextInt();
    
    System.out.println("Informe o tipo de tinta: ");
    
    int tipo = entrada.nextInt();
    
    cubo teste = new cubo(base, altura, tipo);
    
    System.out.println(teste.toString());
    
	entrada.close();
	
    }
}
