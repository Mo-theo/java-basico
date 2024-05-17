package edu.theo.excecoes;

public class ExemploExcecao {
	public static void main(String[] args) {
        
		int valor;
        
		try {
			
			valor = Integer.parseInt("batata");
			System.out.println(valor);
			
		} catch (NumberFormatException nfe) {

			System.out.println("Valor tem que ser um número inteiro!");
			
		} 
		
		/*
		 * É possivel abranger mais de um tipo de exception
		 * com o cathc, evitando assim duplicar código
		 * o modelo ficaria algo assim:
		 * catch (NumberFormatException | NullPointerException e){
		 * 	<comando ao identificar exception>
		 * }
		 */
        
	}
}
