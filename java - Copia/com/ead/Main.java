package com.ead;

import entites.Contratos;
import entites.Departamento;
import entites.Trabalhador;
import entitiesEnums.Funcao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main
{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o seu departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("dados trabalhador: ");
        System.out.println("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.println("Nivel do funcionario: ");
        String nivelFuncionario = sc.nextLine();
        System.out.println("salario: ");
        double salarioFuncionario = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeFuncionario, Funcao.valueOf(nivelFuncionario), salarioFuncionario, new Departamento(nomeDepartamento));


        System.out.println("Quantos contratos o funcionario tem: ");
        int n = sc.nextInt();
        for(int i =1;i<n; i++)
        {
            System.out.println("Digite a data no formato (DD/MM/YYYY): ");
            Date datacontrato = fds.parse(sc.next());
            System.out.println("valor da Horas: ");
            double valorContrato = sc.nextDouble();
            System.out.println("Horas trabalhada: ");
            int horasContrato = sc.nextInt();
            Contratos contratos = new Contratos(datacontrato,valorContrato,horasContrato);
            trabalhador.addContrato(contratos);
        }
        System.out.println();
        System.out.print("Digite a data no formato (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("==== RESUMO DO FUNCIONÁRIO ====");
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Salário base: " + String.format("%.2f", trabalhador.getSalario()));
        System.out.println("Renda total para " + monthAndYear + ": " + String.format("%.2f", trabalhador.calculo(year, month)));



    }
}
