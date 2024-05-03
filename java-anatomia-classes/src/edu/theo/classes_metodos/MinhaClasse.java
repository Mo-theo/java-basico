package edu.theo.classes_metodos;

public class MinhaClasse {
	public static void main(String[] args) {
		
		//na main, public static void main (String[] args) são as palavras de declaração para que o projeto rode
		
		/* existem principais classes/funções, como por exemplo a 
		 * System, que dentro dela podemos ter uma saída: System.out
		 * exigindo que esta saída seja uma impressão System.out.print();
		 * dentro das () deve haver algo a ser impresso, finalizando com:
		 */
		System.out.println("Hello World!");
		
		/*Desta forma temos uma classe criada 
		 * com um método executável, que pode rodar no Eclipse
		 * com a ação "Run"
		 */
		
		
		//Declara duas variáveis para representar o nome e sobrenome
		String primeiroNome = "Theo";
		String segundoNome = "Moraes";
		
		/*Define que uma terceira variável "nomeCompelto" recebe o metodo
		 * "metodoNomeCompleto" com dois parametros, estes sendo as variáveis
		 * "primeiroNome" e "segundoNome"
		 */
		String nomeCompleto = metodoNomeCompleto (primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	/*Define quem é o método a ser usado
	 * este metodo retorna uma String que é composta de dois
	 * parametros. Após definir isso, é atribuído a este metodo
	 * um return que contém a concatenação de strings por dois métodos,
	 * um deles usando o operador + e o outro utilizando o método .concat
	 */
	public static String metodoNomeCompleto (String parametroPrimeiroNome, String parametroSegundoNome) {
		return "Hello " + parametroPrimeiroNome.concat(" ").concat(parametroSegundoNome);
	}
}
