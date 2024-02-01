package livraria.entidades;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private double preco;

    public Livro(String titulo, String autor, String isbn, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "titulo = " + titulo +
                ", autor = " + autor +
                ", isbn = " + isbn +
                ", preco = " + preco;
    }

    public double precoTotal(Livro livro) {

        double value = livro.getPreco();
        if (livro instanceof LivroFisico) {
            value = livro.getPreco() + ((LivroFisico) livro).getFrete();
        }
        return value;
    }

}