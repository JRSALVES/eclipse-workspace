package Aula_1;

public class Executavel {
	
    public static void main(String[] args) {

        Pessoa aluno1 = new Pessoa();

        aluno1.setNome("Jeruso");
        aluno1.setSobrenome("Alves Nascimento");
        aluno1.setIdade(57);

        // Corrigido para melhorar a legibilidade da saída
        System.out.println("Nome: " + aluno1.getNome() + " \nSobrenome: " + aluno1.getSobrenome() + " \nIdade: " + aluno1.getIdade());
    }

}
