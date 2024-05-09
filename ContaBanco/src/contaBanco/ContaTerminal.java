package contaBanco;
import java.util.Scanner;

public class ContaTerminal {
	
	
	Scanner sc = new Scanner(System.in);
	
	int numeroDaConta;
	String agenciaComCodigo;
	String nomeCLiente;
	double saldo;
	
	
	public void novoNumero() {
		System.out.println("Insira o numero da nova conta: ");
		numeroDaConta = sc.nextInt();
		sc.nextLine();
	}
	
	public void novaAgencia() {
		System.out.println("Insira o numero da nova agencia: ");
		agenciaComCodigo = sc.nextLine();
	}
	
	public void novoCliente() {
		System.out.println("Insira o seu nome: ");
		nomeCLiente = sc.nextLine();
		
	}
	
	public void novoSaldo() {
		System.out.println("Insira seu saldo: ");
		saldo = sc.nextDouble();
		sc.nextLine();
	}
	
	
	}


