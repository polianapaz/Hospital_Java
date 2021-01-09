/* Classe Conta Jurídica
 * Criada a partir da classe Conta
 * Atributo extra: cnpj
 * Construtores: dois construtores, seguindo os da classe pai, acrescentando o cnpj
 * Métodos get & set
 * */


public class ContaJuridica extends Conta{
	// Atributos
	private String cnpj;
	
	// Construtores
	public ContaJuridica(String dono, int numero) {  // deveria colocar cnpj tbm?
		super(dono, numero);
	}
	
	public ContaJuridica(String dono, int numero, double saldo, double limite, String cnpj) {
		super(dono, numero, saldo, limite);
		setCnpj(cnpj);
	}
	
	// Métodos get & set
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
}
