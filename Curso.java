/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: assoicação com: turma.
* */


public class Curso {
	
	private String nome;
	private String ch;
	private String ementa;
	private Professor professor;
	
	// instantiation < --- > constructors
	
	public Curso () {
		
	}
	
	public Curso (String nome, String ch, String ementa, Professor professor) {
		this.nome = nome;
		this.ch = ch;
		this.ementa = ementa;
		this.professor = professor;
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
	
	// constructors < --- > setters
	
	public String getName () {
		return this.nome;
	}
	
	public String getCh () {
		return this.ch;
	}
	
	public String getEmenta () {
		return ementa;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public String getAll () {
		return "\nNome: " + this.nome + "\nCarga-Horária: " + this.ch + "\nEmenta: " + this.ementa + "\nProfessor: " + this.professor.getNome();
	}
}


