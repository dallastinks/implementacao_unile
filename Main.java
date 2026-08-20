public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana Souza");

        Disciplina calc = new DisciplinaGraduacao("Cálculo I", 6.5); 
        Disciplina arq = new DisciplinaEspecializacao("Arquitetura Limpa", 'B'); 

        aluno1.adicionarDisciplina(calc);
        aluno1.adicionarDisciplina(arq);

        // Verificando o resultado booleano
        boolean resultadoGeral = aluno1.verificarAprovacaoGeral();
        
        // Transformando o true/false em texto legível
        String status = resultadoGeral ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Situação Geral: " + status + "\n");
    }
}