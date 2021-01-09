/* Classe Paciente
 * Construída a partir da super classe Pessoa
 * Atributos: Doença, Médico, Enfermeiro
 * Construtor contendo apenas o nome e construtor completo
 * Métodos get & set
 * */


public class Paciente extends Pessoa{
	// Atributos
	private String doenca;
	private Medico medico;
	private Enfermeiro enfermeiro;
	
	// Construtores
	public Paciente (String  nome) {
		super(nome);
	}
	
	public Paciente(String nome, String cpf, int idade, String sexo, String doenca, Medico medico, Enfermeiro enfermeiro) {
		super(nome, cpf, idade, sexo);
		setDoenca(doenca);
		setMedico(medico);
		setEnfermeiro(enfermeiro);
	}
	
	// Métodos Get & Set
	public String getDoenca() {
		return doenca;
	}
	
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}
	
	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}
}
