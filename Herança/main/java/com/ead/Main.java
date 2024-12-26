package com.ead;

import Entities.Terceirizado;
import Entities.Trabalhador;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List<Trabalhador> trabalhadorList = new ArrayList<>();

        System.out.println("Quantidade de funcionário: ");
        int quant = sc.nextInt();

        for(int i=1;i<=quant;i++)
        {
            System.out.println("Funcionario "+ i +": ");
            System.out.println("Funcionário terceirizado? (Y/N)");
            char funcionario = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.println("Nome funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.println("Valor das horas: ");
            double valorHoras = sc.nextDouble();
            if(funcionario == 'Y')
            {
                System.out.println("Hora adiciona trabalhada: ");
                int horaADD = sc.nextInt();
                trabalhadorList.add(new Terceirizado(nome,horas,valorHoras,horaADD));
            }
            else
            {
                trabalhadorList.add(new Trabalhador(nome,horas,valorHoras));
            }

        }
        for(Trabalhador emp : trabalhadorList)
        {
            System.out.println(emp.getNome() + " - R$: " + String.format("%.2f", emp.pagamento()));
        }




        sc.close();
    }
}
