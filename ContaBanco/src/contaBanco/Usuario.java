package contaBanco;

public class Usuario {

	public static void main(String[] args) {

		ContaTerminal conta = new ContaTerminal();
		
		conta.novoCliente();
		
		conta.novaAgencia();
		
		conta.novoNumero();
		
		conta.novoSaldo();
		
		System.out.println("Olá " + conta.nomeCLiente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agenciaComCodigo + ", conta " + conta.numeroDaConta + " e o seu saldo de R$" + conta.saldo + " já está disponivel para saque");
		
	}

}
