package livraria.view;

import livraria.entidades.Ebook;
import livraria.entidades.Livro;
import livraria.entidades.LivroFisico;
import livraria.util.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        boolean ativo = true;
        while (ativo) {
            System.out.println("==============================");
            System.out.println("1 - Acessar Lista de Compra ");
            System.out.println("2 - Sair do programa");
            System.out.println("==============================");
            System.out.print("Digite a opção: ");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==============================");
                    System.out.println("Carregando e indo para Livraria!");
                    System.out.println("==============================");
                    proximaPagina();
                    break;
                }
                case "2": {
                    ativo = false;
                    break;
                }
                default:
                    System.out.println("Comando invalido");
                    break;

            }
        }
        System.out.println("Fim do Programa By Gabriel Alves de Lima");
        System.out.println("Meu Site https://vzanbr.github.io/Gabriel-Lima ");
    }

        public static void proximaPagina() {

        Livro livro = new LivroFisico("dragonPlayerFisico", "Gabriel Lima", "001", 120.0, 2.0, 25.0);
        Livro ebook = new Ebook("princessDelavileEbook", "Gabriel Lima", "002", 38, 20);
        Livro ebook1 = new Ebook("princessDelavileEbook2", "Gabriel Lima", "003", 45.0, 50.0);
        Livro livro1 = new LivroFisico("cronicTheRocherFisico", "Gabriel Lima", "004", 145.0, 3.0, 29.0);

        ArrayList<Livro> listaCompras = new ArrayList<>();
        listaCompras.add(livro);
        listaCompras.add(ebook);
        listaCompras.add(ebook1);
        listaCompras.add(livro1);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(listaCompras);

        double totalCompra = carrinhoDeCompras.calcularTotal(listaCompras);

        for (Livro lv : carrinhoDeCompras.getLivros()) {
            String nome = lv.getTitulo();
            double value = lv.getPreco();
            double totalValue = lv.precoTotal(lv);

            System.out.println("\nLivro: " + nome +  "\n" + "Valor: " + value + "R$");

            if (lv instanceof LivroFisico) {
                System.out.println("Valor do Frete: " + ((LivroFisico) lv).getFrete() + "R$");
            }
            System.out.println("Valor Total do Livro: " + totalValue + "R$" + "\n\n");
        }
            System.out.println("===============================");
            System.out.println("CashMarket");
             System.out.println("Valor Total do Carrinho: " + totalCompra + "R$");
            System.out.println("===============================");

                System.out.println("Confirmar compra? (Sim/Não)");
                String resposta = leitor.nextLine();

                if (resposta.equalsIgnoreCase("Sim")) {
                    System.out.println("Compra confirmada! Seu pedido será enviado em breve.");
                }
                 if (resposta.equalsIgnoreCase("Nao")) {
                System.out.println("Compra cancelada!");
            }
    }
}