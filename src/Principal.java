
/* Classe Principal do primeiro projeto do M�dulo 1
 * 
 * Orienta��es: Tudo que est� em quadrados, s�o classes (Paciente, Hospital, M�dico, Enfermeiro...).
 * As setas indicam heran�as. O destino da seta aposta para a classe pai.
 * Os atributos de cada classe est�o listados.
 * A classe Hospital tem atributos do tipo lista com as outras classes.
 * MAIN: criar 5 pacientes, 3 m�dicos, 4 enfermeiros.
 * Criar um m�todo que lista todos os Pacientes de um m�dico a partir do nome do m�dico.
 * */


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Atributos
		String nomeMedico;  // recebe o nome do m�dico a ser procurado
		Hospital primeiroHospital = new Hospital();  // cria a chamada para o hospital
		ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();  // vai armazenar a lista de pacientes criada
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();  // vai armazenar a lista de medicos criada
		ArrayList<Enfermeiro> listaEnfermeiros = new ArrayList<Enfermeiro>();  // vai armazenar a lista de enfermeiros criada
		ArrayList<Paciente> listaPacientes2 = new ArrayList<Paciente>();  // vai armazenar a lista de pacientes criada
		ArrayList<Medico> listaMedicos2 = new ArrayList<Medico>();  // vai armazenar a lista de medicos criada
		ArrayList<Enfermeiro> listaEnfermeiros2 = new ArrayList<Enfermeiro>();  // vai armazenar a lista de enfermeiros criada
		
		Scanner leitor = new Scanner(System.in);
		boolean continuar = true;
		String aux;
		
		//criar as contas PF
		ContaFisica contaF0 = new ContaFisica("Ana Let�cia", 13);
		ContaFisica contaF1 = new ContaFisica("Suzanna Ferraz", 15);
		ContaFisica contaF2 = new ContaFisica("Marcelo Porto", 17);
		
		//criar 3 m�dicos
		Medico medico0 = new Medico("Isabele");
		Medico medico1 = new Medico("Ana Let�cia", "654.231.454-11", 37, "Feminino", "987.45321.88-7", 12, contaF0, 22.744);
		Medico medico2 = new Medico("T�lio Henrique");
		
		//criar 4 enfermeiros
		Enfermeiro enfermeiro0 = new Enfermeiro("Maria Tereza");
		Enfermeiro enfermeiro1 = new Enfermeiro("Suzanna Ferraz","115.424.314-55", 34, "Feminino", "517.66248.88-0", 634, contaF1, "Urologia");
		Enfermeiro enfermeiro2 = new Enfermeiro("�caro Luz");
		Enfermeiro enfermeiro3 = new Enfermeiro("Marcelo Porto", "222.444.324-56", 40, "Masculino", "987.45248.88-2", 153, contaF2, "Ortopedia");
		
		//criar 5 pacientes
		Paciente paciente0 = new Paciente("Luana Silva");
		paciente0.setMedico(medico1);
		Paciente paciente1 = new Paciente("Maria Luiza Coutinho","176.141.664-93", 32, "Feminino", "Infec��o Urin�ria", medico2, enfermeiro1);
		Paciente paciente2 = new Paciente("Fernanda Oliveira");
		paciente2.setMedico(medico0);
		Paciente paciente3 = new Paciente("Luan Souza","109.141.624-35", 12, "Masculino", "Fratura exposta", medico0, enfermeiro3);
		Paciente paciente4 = new Paciente("Igor Emanuel","543.141.624-35", 76, "Masculino", "Gripe", medico1, enfermeiro0);
		
		//criar listas com as pessoas criadas e enviar para o hospital
		//criar lista de pacientes
		listaPacientes.add(paciente0);
		listaPacientes.add(paciente1);
		listaPacientes.add(paciente2);
		listaPacientes.add(paciente3);
		listaPacientes.add(paciente4);
		
		//criar lista de m�dicos
		listaMedicos.add(medico0);
		listaMedicos.add(medico1);
		listaMedicos.add(medico2);
		
		//criar lista de enfermeiros
		listaEnfermeiros.add(enfermeiro0);
		listaEnfermeiros.add(enfermeiro1);
		listaEnfermeiros.add(enfermeiro2);
		listaEnfermeiros.add(enfermeiro3);
		
		//enviar as listas para o hospital
		primeiroHospital.setListaPacientes(listaPacientes);
		primeiroHospital.setListaMedicos(listaMedicos);
		primeiroHospital.setListaEnfermeiros(listaEnfermeiros);
		
		while(continuar) {
			System.out.println("Insira o nome do m�dico:");
			nomeMedico = leitor.nextLine();
			System.out.println("Nome:" + nomeMedico);
			primeiroHospital.buscarPacientes(nomeMedico);
		
			System.out.println("Deseja realizar nova consulta? S/N");
			aux = leitor.nextLine();
			switch(aux) {
				case "S":
					continue;
				case "N":
					System.out.println("Encerrando aplica��o.");
					continuar = false;
				default:
					System.out.println("Op��o Inv�lida. Encerrando aplica��o.");
					continuar = false;
			}
		}
	}
}
