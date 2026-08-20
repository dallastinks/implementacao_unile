import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean verificarAprovacaoGeral() {
        if (disciplinas.isEmpty()) {
            return false;
        }
        
        // O aluno é aprovado se for aprovado em todas as disciplinas (exemplo de regra agregada)
        for (Disciplina d : disciplinas) {
            if (!d.estaAprovado()) {
                return false;
            }
        }
        return true;
    }

    public String getNome() {
        return nome;
    }
}