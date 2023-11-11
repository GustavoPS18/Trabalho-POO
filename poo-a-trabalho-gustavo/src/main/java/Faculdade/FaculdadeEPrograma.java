package Faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaculdadeEPrograma {
    public static void main(String[] args) {
        System.out.println("UniALFA Faculdade");

        List<Alunos> alunos = new ArrayList<>();
        List<Tecnicos> tecnicos = new ArrayList<>();
        List<Assistente> assistentes = new ArrayList<>();
        List<Coordenador> coordenadores = new ArrayList<>();

        var scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha o cadastro");
            System.out.println("Alunos [A]");
            System.out.println("Tecnicos [t]");
            System.out.println("Assistente [a]");
            System.out.println("Coordedador [c]");

            var tipoCadastro = scanner.nextLine();

            if (tipoCadastro.equals("A")) alunos.add(Alunos.construir());
            if (tipoCadastro.equals("t")) tecnicos.add(Tecnicos.construir());
            if (tipoCadastro.equals("a")) assistentes.add(Assistente.construir());
            if (tipoCadastro.equals("c")) coordenadores.add(Coordenador.construir());


            System.out.println("Continuar [1]");

        } while (scanner.nextLine().equals("'"));


    }
}
