package Trabalho;

import java.util.Random;
import java.util.Scanner;


public class Main extends Conta {

	
	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);

		int opcao;
		int tConta = 0;
		contaPoupanca cp = null;
		contaCorrente cc = null;

		do {
			System.out.println("_______ CAIXA ELETRONICO _______");
			System.out.println("|       1 - Abrir Conta        |");
			System.out.println("|       2 - Sacar              |");
			System.out.println("|       3 - Depositar          |");
			System.out.println("|       4 - Saldo              |");
			System.out.println("|       5 - Extrato            |");
			System.out.println("|       0 - Sair               |");
			System.out.println("|______________________________|");
			opcao = imput.nextInt();

			if (opcao == 1) {
				System.out.println("Qual tipo de Conta?\n1.Poupanca\n2.Corrente");
				tConta = imput.nextInt();
				if (tConta == 1) {
					cp = new contaPoupanca();
					cp.setNomeCliente(cp.obterNomeCliente());
					cp.setNumeroConta(cp.gerarNumeroConta());
					System.out.println("Conta Poupanca n " + cp.getNumeroConta() + " criada com Sucesso");
				} else {
					cc = new contaCorrente();
					cc.setNomeCliente(cc.obterNomeCliente());
					cc.setNumeroConta(cc.gerarNumeroConta());
					System.out.println("Conta Corrente n " + cc.getNumeroConta() + " criada com Sucesso");
				}
			} else if (opcao == 2) {
				if(tConta == 1) {
					System.out.print("Informe o valor que deseja Sacar: R$");
					System.out.println(cp.sacar(imput.nextDouble()));
				} else if (tConta == 2) {
					System.out.print("Informe o valor que deseja Sacar: R$" );
					System.out.println(cc.sacar(imput.nextDouble(), cc.getTaxaDeJuros()));
				}
				 
			} else if (opcao == 3) {
				if(tConta == 1) {
					System.out.print("Informe o valor que deseja depositar: R$");
					System.out.println(cp.depositar(imput.nextDouble(), cp.getTaxaRendimento()));
				} else if (tConta == 2) {
					System.out.print("Informe o valor que deseja depositar: R$" );
					System.out.println(cc.depositar(imput.nextDouble()));
				}
				
			} else if (opcao == 4) {
				if (tConta == 1) {
					System.out.println("Saldo da sua conta Popanca: R$" + cp.getSaldo());
				} else if (tConta == 2) {
					System.out.println("Saldo da sua conta Corrente: R$" + cc.getSaldo());
				}
			} else if (opcao == 5) {
				if (tConta == 1) {
					cp.extrato();
				} else if (tConta == 2) {
					cc.extrato();
				}
			}
			
			

		} while (opcao != 0);
	}

}
