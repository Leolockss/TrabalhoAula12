package Trabalho;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do Correntista: ");
		String correntista = sc.next();
		System.out.println("Informe o numero da conta: ");
		int numero = sc.nextInt();

		Conta Usuario = new Conta(correntista, numero);

		int opcao;

		do {
			System.out.println(" ### MENU CAIXA ELETRONICO ###");
			System.out.println("1 - Mostrar dados da conta");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Extrato da Conta");
			System.out.println("0 - Encerraro Operacao");
			System.out.println("Informe a sua opção: ");
			opcao = sc.nextInt();

			if (opcao == 1) {
				Usuario.MostrarDados();
			} else if (opcao == 2) {
				System.out.println("Informa a quantia que deseja sacar: ");
				double ValorSaque = sc.nextDouble();
				Usuario.Sacar(ValorSaque);
			} else if (opcao == 3) {
				System.out.println("Informe a quantia que deseja depositar: ");
				double ValorDeposito = sc.nextDouble();
				Usuario.Depositar(ValorDeposito);
			} else if (opcao == 4) {
				Usuario.Extrato();
			} else if (opcao == 0) {
				System.out.println("Operacao encerada!");
			}

		} while (opcao != 0);
	}
}
