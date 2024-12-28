package com.ead;

import Entities.Contribuinte;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> contribuinteList = new ArrayList<>();
        System.out.println("Quantidade de contribuintes: ");
        int quant = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quant; i++) {
            System.out.printf("Contribuinte #%d:\n", i);
            System.out.println("Digite o Nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a renda anual: ");
            Double rendaAnual = sc.nextDouble();
            sc.nextLine();

            System.out.println("Tipo de contribuinte (F - Pessoa Física / J - Pessoa Jurídica):");
            char ch = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            if (ch == 'F') {
                System.out.println("Digite a quantia gasta em planos de saúde: ");
                double saude = sc.nextDouble();
                sc.nextLine();
                contribuinteList.add(new PessoaFisica(rendaAnual, nome, saude));
            } else if (ch == 'J') {
                System.out.println("Digite a quantidade de funcionários em sua empresa: ");
                int emp = sc.nextInt();
                sc.nextLine();
                contribuinteList.add(new PessoaJuridica(rendaAnual, nome, emp));
            } else {
                System.out.println("Tipo inválido. Ignorando contribuinte.");
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double totalImpostos = 0.0;

        for (Contribuinte x : contribuinteList) {
            double imposto = x.rendaTotal();
            totalImpostos += imposto;
            System.out.printf("%s: R$ %.2f%n", x.getNome(), imposto);
        }

        System.out.printf("%nTOTAL DE IMPOSTOS: R$ %.2f%n", totalImpostos);

        sc.close();
    }
}
