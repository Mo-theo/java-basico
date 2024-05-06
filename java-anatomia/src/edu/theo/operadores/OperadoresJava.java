package edu.theo.operadores;

public class OperadoresJava {
	
	public static void main (String[] args) {
		
		/*
		 * Operadores são caracteres especiais utilizados pelas linguagens de programação
		 * para executar funções básicas, tais como soma e subtração.
		 */
		
		int num1=5, num2=10, num3;
		
		//O operador de soma é +
		num3=num1+num2;
		System.out.println(num3);
		
		//O operador de subtração é -
		num3=num1-num2;
		System.out.println(num3);
		
		//O operador de multiplicação é *
		num3=num1*num2;
		System.out.println(num3);
		
		//O operador de divisão é /
		num3=num2/num1;
		System.out.println(num3);
		
		//Possuimos também operadores mais especiais dos que os apresentados acima:
		
		//O operador de MÓDULO é %, que retorna o resto de uma divisão
		num3=num2%num1;
		System.out.println(num3);
		
		//O operador de incremento de valor é o mesmo
		num1 = num1 +1;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		//Perceba que o ++ é a mesma coisa que var=var+1. O mesmo vale para --
		
		/*
		 * Assim como no JS temos no Java o operador ternario,
		 * que reduz o tamanho da estrutura if else:
		 */
		String resultado;
		
		if (num1 == num2) {
			resultado = "Verdadeiro";
		} else {
			resultado = "Falso";
		}
		
		System.out.println(resultado);
		
		//É o mesmo que escrever:
		
		resultado = (num1==num2) ? "Verdadeiro" : "Falso";
		
		
		System.out.println(resultado);
		
		//Lembrando que o ternario tem que ser assingned a uma variavel, podendo retornar string ou int
		
		
		/*
		 * Para comparar dois objetos ou dois textos
		 * utiliza-se o metodo .equals()
		 */
		
		String vegetal = "Batata";
		String legume = new String ("Batata");
		
		System.out.println(vegetal.equals(legume));
		
		
		
	}
	
		
}
