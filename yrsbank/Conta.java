package yrsbank;

public class Conta {

	// atributos
	private int agencia;
	private int numeroConta;
	protected double saldo;
	private PessoaHeranca titular;

	// Construtores
	// m�todo construtor default
	public Conta() {

	}

	// m�todo construtor com sobrecarga
	public Conta(int agencia, int numeroConta, PessoaHeranca titular) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}

	// m�todos, se tiver m�todos, vai aqui.

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}

		return false;
	}
	
	public boolean transfeir(double valor,Conta destinatario) {
		if(valor >0 && saldo >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		
		
		return false;
	}

	// encapsulamento

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
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

	public PessoaHeranca getTitular() {
		return titular;
	}

	public void setTitular(PessoaHeranca titular) {
		this.titular = titular;
	}

}
