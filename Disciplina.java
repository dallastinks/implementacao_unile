public abstract class Disciplina {
    protected String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato que as subclasses são obrigadas a implementar
    public abstract boolean estaAprovado();
}