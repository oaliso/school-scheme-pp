import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String periodo;
    private Curso curso;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    
    public Turma() {
    	
    }

    public Turma(String codigo, String periodo) {
        this.codigo = codigo;
        this.periodo = periodo;
    }

    public Turma(String codigo, String periodo, Curso curso) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.curso = curso;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void getAvaliacoes() {
        for(Avaliacao avaliacao : avaliacoes) {
			System.out.println("Tipo: " + avaliacao.getTipo());
            System.out.println("Nota máxima: " + avaliacao.getNotaMaxima());
            System.out.println("Peso: " + avaliacao.getPeso() + "\n");
            
		}
    }

    public ArrayList<Avaliacao> getAval() {
        return avaliacoes;
    }
}
