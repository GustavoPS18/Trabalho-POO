package Mercado;

import java.util.Scanner;
import java.util.Set;

public class Caixa {
    public String nome;
    public String setor;
    public String cidade;

    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", Setor='" + setor + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';

    }
    public void imprimir() {System.out.println(this);}

    public static Caixa construir(){
        var caixa = new Caixa();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        caixa.nome = scanner.nextLine();

        System.out.println("Setor: ");
        caixa.setor = scanner.nextLine();

        System.out.println("Cidade: ");
        caixa.cidade = scanner.nextLine();
        return  caixa;
    }
}