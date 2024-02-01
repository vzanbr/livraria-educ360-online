package livraria.util;

import livraria.entidades.Livro;
import livraria.entidades.LivroFisico;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private ArrayList<Livro> livros;

    public CarrinhoDeCompras(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +  "livros=" + livros + '}';
    }

    public double calcularTotal(ArrayList<Livro> carrinhoDeCompras) {
        double valorTotal = 0;

        for (Livro livro : livros) {
            valorTotal += livro.getPreco();

            if (livro instanceof LivroFisico) {
                valorTotal += ((LivroFisico) livro).getFrete();
            }
        }
        return valorTotal;
    }
}