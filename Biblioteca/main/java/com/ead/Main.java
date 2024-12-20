package com.ead;

import Entities.Biblioteca;
import Entities.Estante;
import Entities.Livro;
import EntitiesEnum.EnumGenero;

import java.text.ParseException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da Biblioteca: ");
        String nomeBiblioteca = sc.nextLine();
        System.out.println("Digite o endereço: ");
        String enderecoBiblioteca = sc.nextLine();
        Biblioteca biblioteca = new Biblioteca(nomeBiblioteca,enderecoBiblioteca);

        Estante estante = new Estante("Estante 1");
        biblioteca.addEstante(estante);

        System.out.println("Quantos livros serão alugados hoje: ");
        int quantLivros = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=quantLivros;i++)
        {
            System.out.println("Título do livro: ");
            String titulo = sc.nextLine();
            System.out.println("Autor: ");
            String autor = sc.nextLine();
            System.out.println("Número de paginas: ");
            int numPaginas = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o genero do livro(FICCAO,\n" +
                    "    NAO_FICCAO,\n" +
                    "    FANTASIA,\n" +
                    "    MISTERIO,\n" +
                    "    ROMANCE;): ");
            String Genero = sc.next().toUpperCase();

            EnumGenero enumGenero = EnumGenero.valueOf(Genero);


            Livro livro = new Livro(titulo,autor,numPaginas,enumGenero);
            estante.addLivros(livro);
        }

        System.out.println(biblioteca);
        sc.close();
    }
}
