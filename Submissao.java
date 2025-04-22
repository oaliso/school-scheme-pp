import java.time.LocalDate;

public class Submissao {
    private Aluno aluno;
    private Avaliacao avaliacao;
    private float nota;
    private LocalDate dataEntrega;
    private String observacoes;

    public Submissao(Aluno aluno, Avaliacao avaliacao, float nota, LocalDate dataEntrega, String observacoes) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
        this.nota = nota;
        this.dataEntrega = dataEntrega;
        this.observacoes = observacoes;

        avaliacao.adicionarSubmissao(this);
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}