package Mercado;

import java.util.Scanner;

public class Gerente {

    public String nome;
    public String TempoServico;
    public String cidade;

    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", TempoServico='" + TempoServico + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';

    }
    public void imprimir() {System.out.println(this);}

    public static Gerente construir(){
        var gerente = new Gerente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        gerente.nome = scanner.nextLine();

        System.out.println("TempoServico: ");
        gerente.TempoServico = scanner.nextLine();

        System.out.println("Cidade: ");
        gerente.cidade = scanner.nextLine();
        return gerente;
    }
}
