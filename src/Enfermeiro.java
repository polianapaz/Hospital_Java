/* Classe Enfermeiro
 * Constru�da a partir da super classe Empregado
 * Atributos: Setor
 * Construtor contendo apenas o nome e construtor completo
 * M�todos get & set
 * */


public class Enfermeiro extends Empregado{
	// Atributos
	private String setor;
	
	//Construtores
	public Enfermeiro(String nome) {
		super(nome);
	}
	
	public Enfermeiro(String nome, String cpf, int idade, String sexo, String pis, int matricula, ContaFisica contaF, String setor) {
		super(nome, cpf, idade, sexo, pis, matricula, contaF);
		setSetor(setor);
	}
	
	//M�todos Get & Set
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
}