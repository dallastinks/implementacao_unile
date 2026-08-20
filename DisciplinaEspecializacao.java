public class DisciplinaEspecializacao extends Disciplina {
    private char conceito;

    public DisciplinaEspecializacao(String nome, char conceito) {
        super(nome);
        this.conceito = Character.toUpperCase(conceito);
    }

    @Override
    public boolean estaAprovado() {
        return this.conceito != 'D';
    }
}