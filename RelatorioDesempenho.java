import java.util.ArrayList;
import java.util.List;

public class RelatorioDesempenho {
    private Aluno aluno;
    private Turma turma;
    private List<Submissao> submissoes;
    private float mediaPonderada;
    private float aproveitamento;
    private float soma;

    public RelatorioDesempenho(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.submissoes = new ArrayList<>();
        calcularDesempenho();
        aluno.setRelatorio(this); 
    }

    public void setSub(Submissao sub) {
        submissoes.add(sub);
    }

    public void calcularDesempenho() {
        float somaNotasPonderadas = 0;
        float somaPesos = 0;

        for (Avaliacao avaliacao : turma.getAval()) {
            for (Submissao submissao : avaliacao.getSubmissoes()) {
                if (submissao.getAluno().equals(aluno)) {
                    submissoes.add(submissao);
                    float peso = avaliacao.getPeso();
                    somaNotasPonderadas += submissao.getNota() * peso;
                    somaPesos += peso;
                }
            }
        }

        if (somaPesos > 0) {
            mediaPonderada = somaNotasPonderadas / somaPesos;
            aproveitamento = (mediaPonderada / 10f) * 100f;
        } else {
            mediaPonderada = 0;
            aproveitamento = 0;
        }
    }

    public void getAll() {
        System.out.println("Relatório de Desempenho - " + aluno.getNome());
        System.out.println("Turma: " + turma.getCodigo());
        System.out.println("Notas Individuais:");
        for (Submissao s : submissoes) {
            System.out.println(s.getNota());
            this.soma += s.getNota();
        }
        System.out.println("Média ponderada: " + soma/submissoes.size());
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public List<Submissao> getSubmissoes() {
        return submissoes;
    }

    public float getMediaPonderada() {
        return mediaPonderada;
    }

    public float getAproveitamento() {
        return aproveitamento;
    }
}