package edu.theo.metodos;

public class Metodos {

	public static void main(String[] args) {

		/*Metodos são funções, ações que uma
		 * classe faz
		 * 
		 * 
		 * Antes de cria-los deve estar claro sua proposta
		 * voce deve entender sua finalidade
		 * 
		 * Além disso, deve-se entender qual o tipo de saída será devolvido
		 * por este metodo, pois este deve ser declarado junto do método
		 * Caso não vá haver retorno, deve ser declarado junto da palavra
		 * chave "void"
		 * 
		 */
		
		//Deve ser declarado com um verbo no infinitivo
		

		
		int resultado = somar(2, 3);
		System.out.println(resultado);
		}
	
	public static int somar(int num1, int num2){
		return num1+num2;
		}
	
}
