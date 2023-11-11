package Mercado;

import java.util.Scanner;

public class Empacotador {
    public String nome;
    public String setor;
    public String cidade;

    public String toString() {
        return "Empacotador{" +
                "nome='" + nome + '\'' +
                ", Setor='" + setor + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';

    }
    public void imprimir() {System.out.println(this);}

    public static Empacotador construir(){
        var empacotador = new Empacotador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        empacotador.nome = scanner.nextLine();

        System.out.println("Setor: ");
        empacotador.setor = scanner.nextLine();

        System.out.println("Cidade: ");
        empacotador.cidade = scanner.nextLine();
        return empacotador;
    }
}
