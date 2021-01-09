/* Classe Conta
 * Atributos: Número, Dono, Saldo, Limite
 * Construtor 1: Dono e Número
 * Construtor 2: todos os atributos
 * Métodos: Get & Set, Depositar, Sacar e Transferir
 * 
 * Dúvida na linha 69
 * */

public class Conta {
	
	// Atributos
	private String dono;
	private int numero;
	private double saldo;
	private double limite;
	
	// Construtores (primeiro é o construtor mínimo, depois o completo)
	public Conta(String dono, int numero) {
		setDono(dono);
		setNumero(numero);
	}
	
	public Conta(String dono, int numero, double saldo, double limite) {
		setDono(dono);
		setNumero(numero);
		setSaldo(saldo);
		setLimite(limite);
	}
	
	// Métodos GET e SET
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	// Métodos Depositar, Sacar, Transferir
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Novo saldo: R$ " + saldo);
	}
	
	public void sacar(double valor) {
		if (this.saldo >= valor) {  //seria melhor usar a getSaldo() ?
			this.saldo -= valor;
			System.out.println("Saque realido com sucesso. Novo saldo: R$ " + saldo);
		}
		else {
			System.out.println("Saldo insuficiente. Saldo: R$ " + saldo);
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Valor transferico com sucesso. Novo saldo: R$ " + saldo);
		}
		else {
			System.out.println("Saldo insuficiente. Saldo: R$ " + saldo);
		}
	}
}
