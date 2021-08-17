package Trabalho;

public class contaCorrente extends Conta {

	private final double taxaDeJuros = 0.0005;
	
	public contaCorrente(String tipoConta, String nomeCliente, int numeroConta) {
		super(tipoConta, nomeCliente, numeroConta);

	}

	public contaCorrente() {
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}


	
}
