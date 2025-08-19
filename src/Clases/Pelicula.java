package Clases;

public class Pelicula implements Comparable<Pelicula>{

    private String idPelicula;
    private String Titulo;
    private String Descripcion;

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Pelicula(String idPelicula, String titulo, String descripcion) {
        this.idPelicula = idPelicula;
        Titulo = titulo;
        Descripcion = descripcion;
    }

    public Pelicula() {
    }

    @Override
    public int compareTo(Pelicula o) {
        return 0;
    }
}