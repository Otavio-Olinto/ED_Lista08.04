package view;

import controller.NPRController;
import otavioolinto.pilhas.PilhaInt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe NPRController
		NPRController metodo = new NPRController();
		
		// Instanciando os métodos da classe PilhaInt
		// E criando a pilha
		PilhaInt pilha = new PilhaInt();
		
		// Criando a leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		
		int num, opc = 0;
		
		do {
			
			System.out.println("\nDigite a operação desejada"+
					           "\n1 - Adicionar valor"+
					           "\n2 - Adição"+
					           "\n3 - Multiplicação"+
					           "\n4 - Subtração"+
					           "\n5 - Divisão"+
					           "\n6 - Sair");
			
			opc = Integer.parseInt(ler.nextLine());
			
			switch(opc) {
				
				case 1:
					System.out.print("Digite o valor que deseja adicionar na pilha: ");
					num = Integer.parseInt(ler.nextLine());
					metodo.inserirValor(pilha, num);
					break;
					
				case 2:
					
					try {
						System.out.println("Resultado: "+metodo.npr(pilha, "+"));
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;
					
				case 3:
					
					try {
						System.out.println("Resultado: "+metodo.npr(pilha, "*"));
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;		
					
				case 4:
					
					try {
						System.out.println("Resultado: "+metodo.npr(pilha, "-"));
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;		
					
				case 5:
					
					try {
						System.out.println("Resultado: "+metodo.npr(pilha, "/"));
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;
					
				case 6:
					
					System.out.println("Operação Finalizada!");
					break;
					
				default:
					
					System.out.println("Opção Inválida!");
					break;					
					
			}
		}while(opc!=6);
		
		ler.close();
		
		System.exit(0);
	}

}
