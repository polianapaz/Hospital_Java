/* Classe Médico
 * Construída a partir da super classe Empregado
 * Atributos: CRM
 * Construtor contendo apenas o nome e construtor completo
 * Métodos get & set
 * */


public class Medico extends Empregado{
	// Atributos
	private double crm;
	
	//Construtores
	public Medico(String nome) {
		super(nome);
	}
	
	public Medico(String nome, String cpf, int idade, String sexo, String pis, int matricula, ContaFisica contaF, double crm) {
		super(nome, cpf, idade, sexo, pis, matricula, contaF);
		setCrm(crm);
	}
	
	//Métodos Get & Set
	public double getCrm() {
		return crm;
	}
	
	public void setCrm(double crm) {
		this.crm = crm;
	}
}
