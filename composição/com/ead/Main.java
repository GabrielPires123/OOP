package com.ead;
import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entitiesEnum.OrderStatus;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        Date aniversario = fds.parse(sc.next());
        sc.nextLine();
        Client client1 = new Client(name,email,aniversario);



        System.out.println("Enter order data: ");
        System.out.println("PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGAR");
        String orderStatus = sc.nextLine().toUpperCase();
        OrderStatus status = OrderStatus.valueOf(orderStatus);

        Order order = new Order(new Date(), status, client1);

        System.out.println("How many items to this order: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Enter "+i+" item data:");
            System.out.println("Product name: ");
            String nameItems = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();

            Product product = new Product(nameItems,price);

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity,price,product);

            order.addItem(orderItem);
        }
        System.out.println(order);
        sc.close();
    }
}
