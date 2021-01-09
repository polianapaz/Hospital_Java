/* Classe Empregado
 * Constru�da a partir da super classe Pessoa
 * Atributos: Pis, Matr�cula, Conta F�sica
 * Construtor contendo apenas o nome e construtor completo
 * M�todos get & set
 * */


public class Empregado extends Pessoa{
	// Atributos
	private String pis;
	private int matricula;
	private ContaFisica contaF;
	
	// Construtores
	public Empregado(String nome) {
		super (nome);
	}
	
	public Empregado(String nome, String cpf, int idade, String sexo, String pis, int matricula, ContaFisica contaF) {
		super(nome, cpf, idade, sexo);
		setPis(pis);
		setMatricula(matricula);
		setContaF(contaF);
	}

	// M�todos Get & Set
	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ContaFisica getContaF() {
		return contaF;
	}

	public void setContaF(ContaFisica contaF) {
		this.contaF = contaF;
	}
}
