/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: assoicação com: relatório
* */

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int id;
	private String email;
	private List<Turma> turmas;
	private List<Relatorio> relatorios;
	
	
	// instantiation < --- > constructors
	
	
	public Aluno () {
		
		this.turmas = new ArrayList<>();
		this.relatorios = new ArratList<>();
	}
	
	public Aluno (String nome, int id, String email) {
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.turmas = new ArrayList<>();
		this.relatorios = new ArratList<>();
	}
	
	
	// constructors < --- > setters
	
	
	public void setNome (String nome) {
		this.nome =  nome;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setTurma (Turma turma) {
		turmas.add(turma);
	}
	
	public void setRelatorio (Relatorio relatorio) {
		relatorios.add(relatorio);
	}

	
	// setters < --- > getters 



	public String getNome () {
		return this.nome;
	}
	
	public int getId () {
		return this.id;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public void getTurma () {
		for (Turma turma : turmas) {
			System.out.println(turma.getCodigo());
		}
	}
	
	public void getRelatorios () {
		for (Relatorio relatorio : relatorios) {
			relatorio.getAll();
			
			System.out.println("\n");
			
		}
	}
	
	public void getAll () {
		System.out.println("\nNome: " + this.nome +
				"\nId: " + this.id +
				"\nEmail: " + this.email + 
				"\nTurmas: \n");
		
		for (Turma turma : turmas ) {
			System.out.println(turma.getCodigo());
		}
	}

}


