package ecommerce;

import Faculdade.Alunos;
import Faculdade.Assistente;
import Faculdade.Coordenador;
import Faculdade.Tecnicos;
import Mercado.Livro;
import rpg.JogoRPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("UniALFA Faculdade");
        List<Alunos> Alunos = new ArrayList<>();
        List<Livro> Livro = new ArrayList<>();
        List<JogoRPG> jogoRPG = new ArrayList<>();

        var scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha o cadastro");
            System.out.println("Alunos [A]");
            System.out.println("Livros [L]");
            System.out.println("JogoRPG [J]");


            var tipoCadastro = scanner.nextLine();

            if (tipoCadastro.equals("A")) Alunos.add(Faculdade.Alunos.construir());
            if (tipoCadastro.equals("L")) Livro.add(Mercado.Livro.construir());
            if (tipoCadastro.equals("J")) jogoRPG.add(JogoRPG.construir());



            System.out.println("Continuar [1]");

        } while (scanner.nextLine().equals("'"));


    }
}
