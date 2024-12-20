package Entities;

import EntitiesEnum.EnumGenero;

public class Livro {

   private String titulo;
   private String autor;
   private Integer numPaginas;

   private EnumGenero enumGenero;

    public Livro(String titulo, String autor, Integer numPaginas, EnumGenero enumGenero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.enumGenero = enumGenero;
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

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public EnumGenero getEnumGenero() {
        return enumGenero;
    }

    public void setEnumGenero(EnumGenero enumGenero) {
        this.enumGenero = enumGenero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", enumGenero=" + enumGenero +
                '}';
    }
}
