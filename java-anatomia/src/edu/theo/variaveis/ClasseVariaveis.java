package edu.theo.variaveis;

public class ClasseVariaveis {
	public static void main(String[] args) {
		/*
		 * Deve-se declarar variaveis sempre utilizando camelCase e buscando
		 * ser o mais claro e direto possivel quanto ao que esta deve armazenar, o que ela significa.
		 * Abaixo temos alguns dos principais tipos de variaveis.
		 * Devemos sempre declarar seu tipo antes de seu nome, uma vez que java é o que chamamos de uma linguagem
		 * "typada".
		 */
		String meuTexto = "Esta é uma variavel do tipo string";
		System.out.println(meuTexto);
		
		
		boolean meuBooleano = true;
		System.out.println("Posso imprimir no console variaveis concatenadas desta maneira: " + meuBooleano);
		
		int meuNumeroInteiro = 1000;
		System.out.println(meuNumeroInteiro);
		
		//Posso mudar uma variavel ao reatribuir um valor à ela
		
		meuNumeroInteiro = 1001;
		System.out.println(meuNumeroInteiro);
		
		double meuNumeroReal = 1.61803399;
		System.out.println(meuNumeroReal);
		
		
		/*
		 * Existem variáveis que não devem ser alteradas durante um programa, 
		 * são chamadas estas de constantes. Para declarar uma constante, devemos iniciar com a palavra
		 * final, e por convenção escrever o nome da variável com letras maiusculas
		 */
		
		final String meuTextoConstante = "Este texto não pode ser alterado durante o programa, caso tentemos ele crasha, para testar é só descomentar a reatribuição abaixo";
		System.out.println(meuTextoConstante);
		
		//meuTextoConstante = "Outro texto sendo atribuído à constante";
	}

}
