package Faculdade;

import java.util.Scanner;

public class Alunos {
    private String nome;
    private String formacao;
    private String cidade;


    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", formacao='" + formacao + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';

    }
    public void imprimir() {System.out.println(this);}


    public static Alunos construir(){
        var alunos = new Alunos();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        alunos.nome = scanner.nextLine();

        System.out.println("Formação: ");
        alunos.formacao = scanner.nextLine();

        System.out.println("Cidade: ");
        alunos.cidade = scanner.nextLine();
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }
}
