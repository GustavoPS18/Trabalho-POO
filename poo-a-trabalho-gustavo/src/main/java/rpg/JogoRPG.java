package rpg;

import java.util.Scanner;

public class JogoRPG implements Jogo {
    private String nome;
    private String habilidade;
    private String classe;

    public String toString() {
        return "JogoRPG{" +
                "nome='" + nome + '\'' +
                ", habilidade='" + habilidade + '\'' +
                ", classe='" + classe + '\'' +
                '}';

    }

    public void imprimir() {
        System.out.println(this);
    }

    public static JogoRPG construir() {
        var jogoRPG = new JogoRPG();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        jogoRPG.nome = scanner.nextLine();

        System.out.println("Habilidade: ");
        jogoRPG.habilidade = scanner.nextLine();

        System.out.println("Classe: ");
        jogoRPG.classe = scanner.nextLine();

        return jogoRPG;
    }
    @Override
    public void iniciar(){
        System.out.println("Inciando o jogo RPG: ");
    }

    @Override
    public void encerrar(){
        System.out.println("Encerrando o jogo RPG");
    }
}