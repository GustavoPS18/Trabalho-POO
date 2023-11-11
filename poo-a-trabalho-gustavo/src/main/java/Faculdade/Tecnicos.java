package Faculdade;

import java.util.Scanner;

    public class Tecnicos {
        private String nome;
        private String departamento;
        private String especialidade;

        @Override
        public String toString() {
            return "Tecnicos{" +
                    "nome='" + nome + '\'' +
                    ", departamento='" + departamento + '\'' +
                    ", especialidade='" + especialidade + '\'' +
                    '}';
        }

        public void imprimir() {
            System.out.println(this);
        }

        public static Tecnicos construir() {
            var tecnicos = new Tecnicos();
            var scanner = new Scanner(System.in);

            System.out.println("Nome: ");
            tecnicos.nome = scanner.nextLine();

            System.out.println("Departamento: ");
            tecnicos.departamento = scanner.nextLine();

            System.out.println("Especialidade: ");
            tecnicos.especialidade = scanner.nextLine();

            return tecnicos;
        }
}
