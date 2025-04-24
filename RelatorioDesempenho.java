import java.util.ArrayList;
import java.util.List;

public class RelatorioDesempenho {
    private Aluno aluno;
    private Turma turma;
    private List<Submissao> submissões;
    private float mediaPonderada;
    private float aproveitamento;

    public RelatorioDesempenho(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.submissões = new ArrayList<>();
        calcularDesempenho();
        aluno.setRelatorio(this); 
    }

    public void calcularDesempenho() {
        float somaNotasPonderadas = 0;
        float somaPesos = 0;

        for (Avaliacao avaliacao : turma.getAvaliacoes()) {
            for (Submissao submissao : avaliacao.getSubmissoes()) {
                if (submissao.getAluno().equals(aluno)) {
                    submissões.add(submissao);
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
        for (Submissao s : submissões) {
            System.out.printf("- %s: %.2f\n", s.getAvaliacao().getTipo(), s.getNota());
        }
        System.out.printf("Média Ponderada: %.2f\n", mediaPonderada);
        System.out.printf("Aproveitamento: %.2f%%\n", aproveitamento);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public List<Submissao> getSubmissoes() {
        return submissões;
    }

    public float getMediaPonderada() {
        return mediaPonderada;
    }

    public float getAproveitamento() {
        return aproveitamento;
    }
}