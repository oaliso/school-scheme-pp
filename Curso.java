/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: n/a.
* */

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String ch;
	private String ementa;
	private Professor professor;
	private List<Turma> turmas;
	
	
	// instantiation < --- > constructors
	
	
	public Curso () {
		this.professor = new Professor();
		this.turmas = new ArrayList<>();
	}

	public Curso (String nome, String ch, String ementa) {
		this.nome = nome;
		this.ch = ch;
		this.ementa = ementa;
		this.turmas = new ArrayList<>();
	}
	
	public Curso (String nome, String ch, String ementa, Professor professor) {
		this.nome = nome;
		this.ch = ch;
		this.ementa = ementa;
		this.professor = professor;
		this.turmas = new ArrayList<>();
	}
		
	
	// constructors < --- > setters
	
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setCh (String ch) {
		this.ch = ch;
	}
	
	public void setEmenta (String ementa) {
		this.ementa = ementa;
	}
	
	public void setProfessor (Professor professor) {
		this.professor = professor;
	}
	
	public void setTurma (Turma turma) {
		turmas.add(turma);
	}
	
	
	// setters < --- > getters



public String getName () {
		return this.nome;
	}
	
	public String getCh () {
		return this.ch;
	}
	
	public String getEmenta () {
		return ementa;
	}
	
	public void getProfessor() {
		
		System.out.println(this.professor.getNome());
		
	}
	
	public void getTurma () {
		
		for (Turma turma : turmas) {
			System.out.println(turma.getCodigo());
		}
		
	}
	
	public void getAll () {
		System.out.println("\nNome: " + this.nome + 
						   "\nCarga-Horária: " + this.ch + 
						   "\nEmenta: " + this.ementa + 
						   "\nProfessor: " + this.professor.getNome() + 
						   "\nCódigo da Turma:");
		
		for(Turma turma : turmas) {
			System.out.println(turma.getCodigo());
		}
		
	}
}


