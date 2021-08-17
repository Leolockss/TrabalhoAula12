package Trabalho;

public class contaPoupanca extends Conta {
	
	private final double taxaRendimento = 0.0003;

	public contaPoupanca(String tipoConta, String nomeCliente, int numeroConta) {
		super(tipoConta, nomeCliente, numeroConta);

	}

	public contaPoupanca() {
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	
	
	

}
