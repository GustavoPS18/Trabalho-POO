package Mercado;

import Faculdade.Alunos;
import Faculdade.Assistente;
import Faculdade.Coordenador;
import Faculdade.Tecnicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaEMercado {
    public static void main(String[] args) {
        System.out.println("Mercadinho do Zé");

        List<Caixa> caixa = new ArrayList<>();
        List<Empacotador> empacotadores = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();


        var scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha o cadastro");
            System.out.println("Caixa [C]");
            System.out.println("Empacotadores [E]");
            System.out.println("Gerente [G]");
            System.out.println("Livros [L]");

            var tipoCadastro = scanner.nextLine();

            if (tipoCadastro.equals("C"))caixa.add(Caixa.construir());
            if (tipoCadastro.equals("E")) empacotadores.add(Empacotador.construir());
            if (tipoCadastro.equals("G"))gerentes.add(Gerente.construir());
            if (tipoCadastro.equals("L"))livros.add(Livro.construir());


            System.out.println("Continuar [1]");

        } while (scanner.nextLine().equals("'"));
    }

}
