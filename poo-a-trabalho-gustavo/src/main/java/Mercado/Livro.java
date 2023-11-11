package Mercado;

import java.util.Scanner;

public class Livro {

    public String nome;
    public String autor;
    public String preco;



    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", preco='" + preco + '\'' +
                '}';

    }
    public void imprimir() {System.out.println(this);}

    public static Livro construir(){
        var livro = new Livro();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        livro.nome = scanner.nextLine();

        System.out.println("Autor: ");
        livro.autor = scanner.nextLine();

        System.out.println("Preco: ");
        livro.preco = scanner.nextLine();
        return livro;
    }

    public String calcularPreço() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }
}
