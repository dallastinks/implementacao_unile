public class DisciplinaGraduacao extends Disciplina {
    private double media;

    public DisciplinaGraduacao(String nome, double media) {
        super(nome); // Chama o construtor da classe pai
        this.media = media;
    }

    @Override
    public boolean estaAprovado() {
        return this.media >= 7.0;
    }
}