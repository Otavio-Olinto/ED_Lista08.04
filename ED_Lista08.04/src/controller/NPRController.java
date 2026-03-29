package controller;

import otavioolinto.pilhas.PilhaInt;

public class NPRController {

	public NPRController() {
		super();
	}
	
	public void inserirValor(PilhaInt pilha, int num) {
		
		pilha.push(num);
		
	}
	
	public int npr(PilhaInt pilha, String op)throws Exception {
		
		int resultado = 0;
		int num1, num2;
		
		if(pilha.size()<2) {
			
			throw new Exception("Pilha com apenas "+pilha.size()+" valor.\n"+
								"Insira mais valores.");
			
		}
		
		if(op.equals("+")) {
			
			num1 = pilha.pop(); 
			num2 = pilha.pop();
			resultado = num2 + num1;
			pilha.push(resultado);
			
		}else if(op.equals("*")) {
			
			num1 = pilha.pop(); 
			num2 = pilha.pop();
			resultado = num2 * num1;
			pilha.push(resultado);
			
		}else if(op.equals("-")) {
			
			num1 = pilha.pop(); 
			num2 = pilha.pop();
			resultado = num2 - num1;
			pilha.push(resultado);
			
		}else{
			
			num1 = pilha.pop(); 
			num2 = pilha.pop();
			resultado = num2 / num1;
			pilha.push(resultado);
			
		}
		
		return resultado;
	}

}
