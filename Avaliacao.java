import java.util.ArrayList;

public class Avaliacao {
    private String tipo; // prova, trabalho, projeto
    private float notaMaxima;
    private float peso;
    private Turma turma;
    private ArrayList<Submissao> submissoes = new ArrayList<>();

    public Avaliacao(String tipo, float notaMaxima, float peso) {
        this.tipo = tipo;
        this.notaMaxima = notaMaxima;
        this.peso = peso;
    }

    public Avaliacao(String tipo, float notaMaxima, float peso, Turma turma) {
        this.tipo = tipo;
        this.notaMaxima = notaMaxima;
        this.peso = peso;
        this.turma = turma;
        turma.adicionarAvaliacao(this);
    }

    public void adicionarSubmissao(Submissao submissao) {
        submissoes.add(submissao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getNotaMaxima() {
        return notaMaxima;
    }

    public void setNotaMaxima(float notaMaxima) {
        this.notaMaxima = notaMaxima;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Submissao> getSubmissoes() {
        return submissoes;
    }
}
