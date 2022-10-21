package formas;

import java.util.Scanner;

public class coneMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	    System.out.println("Informe os dados do cone: ");
	    
	    int raio = entrada.nextInt();
	    int geratriz = entrada.nextInt();
	    
	    System.out.println("Informe o tipo de tinta: ");
	    
	    int tipo = entrada.nextInt();
	    
	    cone teste = new cone(raio, geratriz, tipo);
	    
	    System.out.println(teste.toString());
	    
		entrada.close();
		
	    }

	}

