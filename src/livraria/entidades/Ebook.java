package livraria.entidades;

public class Ebook extends Livro {

    private double tamanhoMegabyte;

    public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoMegabyte) {
        super(titulo, autor, isbn, preco);
        this.tamanhoMegabyte = tamanhoMegabyte;
    }

    public double getTamanhoMb() {
        return tamanhoMegabyte;
    }

    public void setTamanhoMb(double tamanhoMb) {
        this.tamanhoMegabyte = tamanhoMb;
    }

    @Override
    public String toString() {
        return super.toString() + " [tamanhoMB = " + tamanhoMegabyte + "]";
    }

}