package edu.theo.controleFluxo;
import java.util.Scanner;

public class ControleFLuxo {

	public static void main(String[] args) {
		/*double saldo = 25;
		*double valorSolicitado = 17;
		*
		*if (valorSolicitado < saldo) {
		*	saldo = saldo - valorSolicitado;
		*} else {
			System.out.println("Saldo insuficiente");
		*}
		
		*System.out.println("Seu saldo atual é de: " + saldo);
		*/
		/*
		*int i = 0, numero = 0, resto = 1;	
		*Scanner scanner = new Scanner (System.in);
		
			*System.out.println("Este numero é primo?");
			*System.out.println("Digite um número:");
			*numero = scanner.nextInt();
			*scanner.close();
		*/
		
		//i=numero-1;
		
		//do {
		//	resto = numero%i;
		//	System.out.println("Divisor: " + i + "; Resto: " + resto);
		//	i--;
		//} while ((i > 1) && (resto > 0));
		
		/*for (i=numero-1; ((i>1) && (resto>0)); i--) {
		*	resto = numero%i;
		*	System.out.println("Divisor: " + i + "; Resto: " + resto);
		*}
		
		*String primo = (resto > 0) ? "Este número é primo" : "Este número não é primo";
		*
		*System.out.println(primo);
		*/
		
		
		
		
		
		
		Scanner scanner = new Scanner (System.in);
		int i=0, j=0;
		int numeros [][] = new int[2][2];
		
		for (i=0; i<2; i++) {
			for (j=0; j<2;j++) {
				numeros[i][j] = 0;
			}
		}
		
		for (i=0; i<2; i++) {
			for (j=0; j<2;j++) {
				System.out.println("Insira um valor: ");
				numeros[i][j] = scanner.nextInt();;
			}
		}
		
		scanner.close();
		
		for (i=0; i<2; i++) {
			for (j=0; j<2;j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
		//break quebra um fluxo, enquanto o continue pula a execução e retorna ao laço

}
