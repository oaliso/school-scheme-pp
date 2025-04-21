public class Avaliacao {
    
    private String tipo; // prova, trabalho, projeto
    private float notaMaxima;
    private float peso;
    private Turma turma;

    public Avaliacao(String tipo, float notaMaxima, float peso, Turma turma) {
        this.tipo = tipo;
        this.notaMaxima = notaMaxima;
        this.peso = peso;
        this.turma = turma;
        turma.adicionarAvaliacao(this);
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

}

/*
    import java.util.ArrayList;

    private ArrayList<Submissao> submissoes = new ArrayList<>();

    public void adicionarSubmissao(Submissao submissao) {
        submissoes.add(submissao);
    }

    public void removerSubmissao(Submissao submissao){
        submissoes.remove(submissao);
    }

    public ArrayList<Submissao> getSubmissoes() {
        return submissoes;
    }