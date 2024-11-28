package com.ead;
import entities.contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua conta bancaria:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do titular:");
        String titular = sc.next();

        System.out.println("Digite o saldo da Conta:");
        double saldo = sc.nextDouble();

        clearScreen();
        contaBancaria x = new contaBancaria(numeroConta,titular,saldo);
        int op;
        do {

            {
                System.out.println("--Menu--\n" +
                        "1- Saldo\n" +
                        "2- saque\n" +
                        "3- deposito\n" +
                        "4- informações da conta\n" +
                        "0- Finalizar"
                       );
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Saldo em conta: "+ x.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite um valor a ser sacado");
                        double valor = sc.nextDouble();
                        x.sacar(valor);
                        break;
                    case 3:
                        System.out.println("Digite um valor a ser sacado");
                        valor= sc.nextDouble();
                        x.depositar(valor);
                        break;
                    case 4:
                        System.out.printf("Nome do titula: %s%nNúmero da conta: %d",x.getTitular(),x.getNumeroConta());
                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                        op=0;



                }
            }
        }
        while(op!=0);


    }
    public static void clearScreen() {
        for(int i=0;i<20;i++)
        {
            System.out.println();
        }

    }
}