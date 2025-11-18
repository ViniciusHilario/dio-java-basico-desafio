import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome, sobrenome, cliente;
		String agencia;
		int numConta;
		double saldo;

		System.out.println("Para criação da conta será preciso algumas informações");
		
		System.out.println("Por favor digite seu NOME:");
		nome = sc.next();
		
		System.out.println("Por favor digite seu SOBRENOME:");
		sobrenome = sc.next();
		
		System.out.println("Por favor digite o número da AGÊNCIA:");
		agencia = sc.next();
		
		System.out.println("Por favor digite o número da CONTA:");
		numConta = sc.nextInt();
		
		System.out.println("Por favor digite o valor do SALDO:");
		saldo = sc.nextDouble();
		
		
		System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

	}

}
