package Trabalho;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Conta {

	private String correntista;
	private int numero;
	private double saldo = 0;
	private boolean saque;
	private double taxaMovimentacaoDep = 0.2;
	private double taxaMovimentacaoSaq = 0.5;
	List<String> extrato = new ArrayList<String>();

	public Conta(String correntista, int numero) {
		this.correntista = correntista;
		this.numero = numero;
		this.saldo = saldo;

	}

	Date data = new Date();

	public void MostrarDados() {
		System.out.println("Correntista: " + correntista + " C/c: " + numero + "Saldo: R$" + saldo);
	}

	public void Depositar(double ValorDeposito) {
		this.saldo = saldo + ValorDeposito - taxaMovimentacaoDep;
		System.out.println("Depositado: R$" + ValorDeposito + " na sua conta, com sucesso!!");
		System.out.println("Taxa no valor de: R$" + taxaMovimentacaoDep);
		extrato.add("Depósito de: R$" + ValorDeposito);
		extrato.add("Taxa de: R$" + taxaMovimentacaoDep);
	}

	public void Sacar(double ValorSaque) {
		if (ValorSaque > saldo) {
			saque = false;
			System.out.println("Saldo insuficiente!");
		} else {
			this.saldo = saldo - ValorSaque - taxaMovimentacaoSaq;
			saque = true;
			System.out.println("Saque de: R$" + ValorSaque + " realizado com sucesso!!");
			System.out.println("Taxa no valor de: R$" + taxaMovimentacaoSaq);
			extrato.add("Saque de: R$" + ValorSaque);
			extrato.add("Taxa de: R$" + taxaMovimentacaoSaq);
		}
	}

	public void Extrato() {
		System.out.println("### EXTRATO DA CONTA ###");
		System.out.println("Conta Corrente: " + numero);
		System.out.println("Correntista: " + correntista);
		System.out.println("------" + data + "------");
		for (String string : extrato) {
			System.out.println(string);
		}
		System.out.println("------" + "R$" + saldo + "------");
		System.out.println("");
	}

	@Override

	public String toString() {
		return "Correntista: " + this.correntista + ", C/c: " + this.numero;
	}
}