/* Classe Pessoa
 * Atributos: Nome, Cpf, Idade, Sexo
 * Construtor contendo apenas o nome e construtor completo
 * Métodos get & set
 * */


public class Pessoa {
	// Atributos
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	
	// Construtores
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(String nome, String cpf, int idade, String sexo) {
		setNome(nome);
		setCpf(cpf);
		setIdade(idade);
		setSexo(sexo);
	}

	// Métodos Get & Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
