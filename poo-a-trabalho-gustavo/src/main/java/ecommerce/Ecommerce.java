package ecommerce;

import Faculdade.Alunos;
import Mercado.Livro;
import Faculdade.Alunos;
import Mercado.Livro;
import rpg.Jogo;

public class Ecommerce{
    private Alunos aluno;
    private Alunos nome;
    private Livro livro;
    private Livro Preço;
    private Jogo jogo;

    public Ecommerce(Alunos aluno, Livro livro, Jogo jogo){

        this.aluno = aluno;

        this.livro = livro;

        this.jogo = jogo;
    }

    public void realizarCompra(){
        System.out.println("Realizando compra para o aluno: " + aluno.getNome() + ", Matricula: " + aluno.getFormacao());
        System.out.println("Produto: " + livro.getNome() + ", Preço: R$" + livro.getPreco() + ", Desconto: R$" + livro.calcularPreço());

        System.out.println("Iniciando o jogo RPG");
        jogo.iniciar();
        jogo.encerrar();

        System.out.println("Compra realizada!");
    }

    public void realizarPagamento(double valor){
        System.out.println("Realizando pagamento no valor de R$" + valor);
        System.out.println("Pagamento realizado!");
    }
}

