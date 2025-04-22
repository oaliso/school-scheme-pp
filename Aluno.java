/* * 
 * Classe desenvolvida por Alisson de Carvalho Silva 
 * Pendente: assoicação com: turma, relatório
* */


public class Aluno {
	
	private String nome;
	private int id;
	private String email;
	
	
	// instantiation < --- > constructors
	
	
	public Aluno () {
		
	}
	
	public Aluno (String nome, int id, String email) {
		this.nome = nome;
		this.id = id;
		this.email = email;
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
	

}


