package DioJavaBasico;
import java.util.Scanner;
public class ContaBanco {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.println("Qual o numero da agencia? ");
		num = s.nextInt();
		System.out.println("Qual a agencia? ");
		agencia = s.next();
		System.out.println("Qual o nome do cliente? ");
		nomeCliente = s.next();
		System.out.println("Qual o saldo? ");
		saldo = s.nextDouble();
		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque");
		s.close();
	}

}
