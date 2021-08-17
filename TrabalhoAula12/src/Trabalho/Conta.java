package Trabalho;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Conta {

	private String tipoConta;
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	List<String> extrato = new ArrayList<String>();

	public Conta(String tipoConta, String nomeCliente, int numeroConta) {
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		
	}
	
	Date data = new Date();

	Scanner imput = new Scanner(System.in);
	
	public Conta() {
	}

	
	public int gerarNumeroConta() {
		Random random = new Random();
		return random.nextInt(99999999);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public String obterNomeCliente() {
		System.out.println("Informe o seu nome: ");
		return imput.next();
	}

	public String sacar(double valor) {
		if (valor < saldo) {
			saldo = saldo - valor;
			extrato.add("Saque de: R$" + valor);
			return "Saque Realizado";
		} else {
			return "Saldo " + saldo + " insuficiente!";
		}
	}
	
	public String sacar(double valor, double taxaDeJuros) {
		if ((valor - (valor * taxaDeJuros)) < saldo) {
			extrato.add("Saque de: R$" + valor);
			extrato.add("Taxa de de: R$ -" + (valor * taxaDeJuros));
			saldo = saldo - (valor + (valor * taxaDeJuros));
			
			return "Saque Realizado";
		} else {
			return "Saldo " + saldo + " insuficiente!";
		}
	}

	public String depositar(double valor) {
		if (valor > 0) {
			extrato.add("Depósito de: R$" + valor);
			saldo = saldo + (valor);
			return "Valor depositado";
		} else {
			return "Impossivel depositar valor negativo";
		}
	}
	
	public String depositar(double valor, double taxaRendimento) {
		if (valor > 0) {
			extrato.add("Depósito de: R$" + valor);
			extrato.add("Rendimento de: R$ +" + (valor * taxaRendimento));
			saldo = saldo + (valor + (valor * taxaRendimento));
			return "Valor depositado";
		} else {
			return "Impossivel depositar valor negativo";
		}
	}
	
	public void extrato() {
		System.out.println("### EXTRATO DA CONTA ###");
		System.out.println("Conta Corrente: " + numeroConta);
		System.out.println("Titular: " + nomeCliente);
		System.out.println("Tipo de Conta: " + tipoConta);
		System.out.println("------" + data + "------");
		for (String string : extrato) {
			System.out.println(string);
		}
		System.out.println("------" + "R$" + saldo + "------");
		System.out.println("");
	}
	

	@Override
	public String toString() {
		return "Conta do Tipo" + this.getTipoConta() + ", Nome do titular: " + this.getNomeCliente()
				+ ", numero da Conta: " + this.getNumeroConta();
	}

}
