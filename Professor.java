/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: nenhuma.
* */


public class Professor {
	
	private String nome;
	private String especialidade;
	private int id;
	private Curso curso;
	
	
	// instantiation < --- > constructors
	
	
	public Professor () {
		
	}
	
	public Professor (String nome, String especialidade, int id, Curso curso) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.id = id;
		this.curso = curso;
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
		this.curso = curso;
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
	
	public Curso getCurso () {
		return this.curso;
	}
	
	public String getAll () {
		return "\nNome: " + this.nome + "\nEspecialidade: " + this.especialidade + "\nId: " + this.id + "\nCurso: " + this.curso.getName(); 
	}

}
	
	
	




