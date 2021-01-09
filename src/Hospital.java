import java.util.ArrayList;

public class Hospital {
	// Atributos
	private ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
	private ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
	private ArrayList<Enfermeiro> listaEnfermeiros = new ArrayList<Enfermeiro>();
	private ContaJuridica contaJ;
	private Medico medicoPaciente;
	private String nomeMedicoAux;
	
	// Construtores
			
	// Métodos Get & Set
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	public ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}
	public void setListaMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	public ArrayList<Enfermeiro> getListaEnfermeiros() {
		return listaEnfermeiros;
	}
	public void setListaEnfermeiros(ArrayList<Enfermeiro> listaEnfermeiros) {
		this.listaEnfermeiros = listaEnfermeiros;
	}
	public ContaJuridica getContaJ() {
		return contaJ;
	}
	public void setContaJ(ContaJuridica contaJ) {
		this.contaJ = contaJ;
	}
	public Medico getMedicoPaciente() {   // Precisa de get e set para medicoPaciente?
		return medicoPaciente;
	}
	public void setMedicoPaciente(Medico medicoPaciente) {
		this.medicoPaciente = medicoPaciente;
	}
	
	/* Métodos - consultar todos os pacientes de um médico a partir do nome do médico
	 * Hospital --> Paciente --> Médico
	 **/
	public void buscarPacientes(String nomeMedico){
		ArrayList<Paciente> listaPacientes2 = new ArrayList<Paciente>();
		for(Paciente i: listaPacientes) {
			medicoPaciente = i.getMedico();
			nomeMedicoAux = medicoPaciente.getNome();
			if(nomeMedicoAux.equals(nomeMedico)) {
				listaPacientes2.add(i);
			}
		}
		System.out.println("Lista de pacientes de " + nomeMedico);
		if (listaPacientes2.size()==0) {
			System.out.println("Médico não encontrado!");
		}
		else {
			for(Paciente i:listaPacientes2) {
				System.out.println(i.getNome());
			}
		}
	}
}
