package Entities;

import java.util.ArrayList;
import java.util.List;

public class Estante {

    private String identificador;
    private List<Livro> livroList = new ArrayList<>();

    public Estante(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void addLivros(Livro livros)
    {
        livroList.add(livros);
    }
    public void removeLivrors(Livro livros)
    {
        livroList.add(livros);
    }

    @Override
    public String toString() {
        return "Estante{" +
                "identificador='" + identificador + '\'' +
                ", livroList=" + livroList +
                '}';
    }
}
