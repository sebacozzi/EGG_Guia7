package Entidad;

/**
 *
 * @author Sebastián Cozzi
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numerodePaginas;

    public Libro(String ISBN, String titulo, String autor, int numerodePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
    }
    
    public Libro(){
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN.length()==13){
           this.ISBN = ISBN;
          } else System.out.println("Error: El ISBN debe tener un largo de 13 digitos.");
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

    public int getNumerodePaginas() {
        return numerodePaginas;
    }

    public void setNumerodePaginas(int numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    @Override
    public String toString() {
        return "Libro:\n ISBN= " + ISBN + ".\n titulo= " + titulo + ".\n autor= " + autor + ".\n Número de Paginas= " + numerodePaginas + ".";
    }
            
}
