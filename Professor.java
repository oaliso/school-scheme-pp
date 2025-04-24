/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: n/a.
* */

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	private String especialidade;
	private int id;
	private List<Curso> cursos;
	
	
	// instantiation < --- > constructors
	
	
	public Professor () {
		this.cursos = new ArrayList<>();
	}

	public Professor (String nome, String especialidade, int id) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.id = id;
		this.cursos = new ArrayList<>();
	}

	public Professor (String nome, String especialidade, int id, Curso curso) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.id = id;
		this.cursos = new ArrayList<>();
	}

	
	
	// constructors < --- > setters
	
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setEspecialidade (String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setCurso (Curso curso) {
		cursos.add(curso);
	}
	
	
	// setters < --- > getters 
	
	public String getNome () {
		return this.nome;
	}
	
	public String getEspecialidade () {
		return this.especialidade;
	}
	
	public int getId () {
		return this.id;
	}
	
	public void getCurso () {
		
		for (Curso curso : cursos) {
			System.out.println("\n" + curso.getName());
		}
		
	}
	
	public void getAll () {
		System.out.println("\nNome: " + this.nome + 
						   "\nEspecialidade: " + this.especialidade + 
			               "\nId: " + this.id + 
			               "\nCursos:");
		
		for( Curso curso : cursos) {
			System.out.println("  - " + curso.getName());
		}
	}

}
	
	
	




