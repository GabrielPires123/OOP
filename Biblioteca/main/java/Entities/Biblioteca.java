package Entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private String endereco;
    private List<Estante> estanteList = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addEstante(Estante estante)
    {
        estanteList.add(estante);
    }
    public void removeEstante(Estante estante)
    {
        estanteList.add(estante);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", estanteList=" + estanteList +
                '}';
    }
}
