/* Classe Conta Física
 * Usa classe Conta como superclasse
 * Atributo extra: cpf
 * Construtores da classe pai incluindo o cpf no construtor completo
 * Métodos Get & Set
 * */


public class ContaFisica extends Conta{
	// Atributos
	private String cpf;
	
	// Construtores
	public ContaFisica(String dono, int numero) {  // deveria colocar cpf tbm?
		super(dono, numero);
	}
	
	public ContaFisica(String dono, int numero, double saldo, double limite, String cpf) {
		super(dono, numero, saldo, limite);
		setCpf(cpf);   // precisa do this. ?
	}
	
	// Métodos get & set
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
}
